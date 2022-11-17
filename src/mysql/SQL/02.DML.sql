##########################################################
#
#   데이터 조작 언어(DML: Data Manipulation Language)
#
##########################################################

 /* 
  * 2. 수정(UPDATE)
UPDATE 테이블명
	SET 필드명=값[, 필드명=값, 필드명=값, ...]
	WHERE 조건;
  */

# Yong-in 시의 이름을 용인으로 변경
UPDATE city
	SET `Name`='용인'
	WHERE ID=2362;

# Suwon 시의 이름을 수원으로 변경하고 인구도 100만으로 변경
UPDATE city
	SET `Name`='수원', Population=1000000
	WHERE ID=2340;

# Kang-won의 이름을 강원도로 변경
UPDATE city SET District='강원도'
	WHERE District='Kang-won';

/*
 * 3. 생성(INSERT) 
INSERT INTO 테이블명 (필드명)
	VALUES (필드값);
 */
# 속초시 추가
INSERT INTO city (`Name`, CountryCode, District, Population)
	VALUES ('속초', 'KOR', '강원도', 100000);

INSERT INTO city
	VALUES (DEFAULT, '속초', 'KOR', '강원도', 100000);

# 여러건의 데이터 입력
# 경기도에 화성시와 의정부시를 추가
INSERT INTO city VALUES 
    (DEFAULT, '화성', 'KOR', 'Kyonggi', 500000),
	(DEFAULT, '의정부', 'KOR', 'Kyonggi', 300000);

# 대량 데이터 삽입
# 국내 도시만으로 된 새로운 테이블을 생성하고 기존 테이블의 데이터로 채우기
CREATE TABLE if NOT EXISTS koreanCity LIKE city;
INSERT INTO koreanCity
	SELECT * FROM city WHERE CountryCode='KOR';

/* 
 * 4. 삭제(DELETE) 
DELETE FROM 테이블명
	WHERE 조건
*/

# ID=4083 인 레코드 삭제
DELETE FROM city WHERE ID=4083;

# 4081 <= ID <=4083 인 레코드 삭제
DELETE FROM koreanCity
	WHERE ID >= 4081 AND ID <= 4083;

# 인구수가 10만 미만인 도시를 삭제
DELETE FROM koreanCity
	WHERE Population < 100000; 