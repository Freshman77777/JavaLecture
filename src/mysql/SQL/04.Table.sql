##########################################################
#
#   데이터 정의 언어(DDL: Data Definition Language)
#
##########################################################

/*
 * 1. Table 생성
CREATE TABLE 테이블명 (
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	...
) [Extra];
 *
 */

# 주소록 테이블 생성
CREATE TABLE if NOT EXISTS addrBook (
	num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(4) NOT NULL,
	tel VARCHAR(14) NOT NULL,
	birthday DATE
) AUTO_INCREMENT=101;

# 고객 테이블 생성
CREATE TABLE if NOT EXISTS customer (
	uid VARCHAR(10) PRIMARY KEY,
	pwd CHAR(44) NOT NULL,			# 암호화한 결과를 저장
	`name` VARCHAR(4) NOT NULL,
	email VARCHAR(20),
	regDate DATE DEFAULT (CURRENT_DATE),
	isDeleted INT DEFAULT 0
);

/*
 * 2. 테이블 조회
 */
# 데이터베이스 내의 테이블 목록
SHOW TABLES;

# 테이블 구조
DESC customer;

/*
 * 3. 테이블 삭제 (DROP)
 */
# test2 테이블 삭제
DROP TABLE test2;

# test 테이블 내용 삭제
TRUNCATE test;

/*
 * 4. 테이블 이름 변경 (RENAME)
 */
# koreanCity -> korCity 
RENAME TABLE koreanCity TO korCity;

/*
 * 5. 테이블 구조 변경 (ALTER)
 */

# customer 테이블에 tel 항목 추가
ALTER TABLE customer 
	ADD tel VARCHAR(14);

# customer 테이블에 tel 항목 삭제
ALTER TABLE customer 
	DROP tel;

# customer 테이블에 name 항목 다음에 tel 항목 추가
ALTER TABLE customer 
	ADD tel VARCHAR(14) AFTER `name`;

# customer 테이블의 tel 항목에 not null 추가
ALTER TABLE customer 
	CHANGE tel tel VARCHAR(14) NOT NULL;

/*
 * 6. View 생성
 */
# 인구 900만 이상인 도시로 largeCity 뷰 생성
CREATE VIEW largeCity
	AS SELECT * FROM city WHERE Population >= 9000000
	WITH CHECK OPTION;

# 서울의 인구를 8900000으로 변경하면 에러가 발생(Check option 위배)
UPDATE largeCity SET Population=8900000 WHERE ID=2331;

# city 테이블에서 변경하면 largeCity에도 반영이 됨
UPDATE city SET Population=9900000 WHERE ID=2331;