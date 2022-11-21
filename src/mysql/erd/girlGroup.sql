SET SESSION FOREIGN_KEY_CHECKS=1;

/* Drop Tables */

DROP TABLE IF EXISTS hitSong;
DROP TABLE IF EXISTS girlGroup;




/* Create Tables */

CREATE TABLE girlGroup
(
	gid int NOT NULL AUTO_INCREMENT,
	gname varchar(20) NOT NULL,
	company varchar(20) NOT NULL,
	debut date DEFAULT (CURRENT_DATE),
	PRIMARY KEY (gid)
) AUTO_INCREMENT=101;


CREATE TABLE hitSong
(
	sid int NOT NULL AUTO_INCREMENT,
	sname varchar(20) NOT NULL,
	composer varchar(20),
	writer varchar(20),
	gid int NOT NULL,
	PRIMARY KEY (sid)
)AUTO_INCREMENT=1001;



/* Create Foreign Keys */

ALTER TABLE hitSong
	ADD FOREIGN KEY (gid)
	REFERENCES girlGroup (gid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



