CREATE DATABASE SSAFIT_SPRING;
USE SSAFIT_SPRING;
CREATE TABLE VIDEO(
	ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    TITLE VARCHAR(100) CHARACTER SET utf8mb4 COLLATE UTF8MB4_0900_AI_CI NOT NULL,
    PART VARCHAR(10) CHECK (PART IN ('가슴', '어깨', '등', '하체', '전신', '복부', '상체')),
    LINK VARCHAR(40),
    VIEWCNT INT NOT NULL DEFAULT 0,
    CHANNELNAME VARCHAR(20) CHARACTER SET utf8mb4 COLLATE UTF8MB4_0900_AI_CI NOT NULL
)ENGINE=InnoDB;

CREATE TABLE USER(
	ID VARCHAR(100) PRIMARY KEY,
    PASSWORD VARCHAR(100),
    EMAIL VARCHAR(100)
)ENGINE=InnoDB;


CREATE TABLE REVIEW(
	REVIEWID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    VIDEOID INT NOT NULL,
    TITLE VARCHAR(100) CHARACTER SET utf8mb4 COLLATE UTF8MB4_0900_AI_CI NOT NULL,
    WRITER VARCHAR(20) NOT NULL,
    CONTENT TEXT CHARACTER SET utf8mb4 COLLATE UTF8MB4_0900_AI_CI NOT NULL,
    REGDATE DATETIME DEFAULT CURRENT_TIMESTAMP,
    VIEWCNT INT NOT NULL DEFAULT 0,
    FOREIGN KEY (VIDEOID) REFERENCES VIDEO(ID),
    FOREIGN KEY (WRITER) REFERENCES USER(ID)
    
)ENGINE=InnoDB;





INSERT INTO video (link, channelname, title, part, viewCnt) 
VALUES
("gMaB-fG4u4g", "ThankyouBUBU", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", '전신', 0),
("swRNeYw1JkY","ThankyouBUBU", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", '전신', 0),
("54tTYO-vU2E","ThankyouBUBU", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", '상체', 0),
("QqqZH3j_vH0","ThankyouBUBU", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]", "상체", 0),
("tzN6ypk6Sps", "김강민", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]", '하체', 0),
("u5OgcZdNbMo", "GYM종국", "저는 하체 식주의자 입니다", "하체", 0),
("PjGcOP-TQPE", "ThankyouBUBU", "11자복근 복부 최고의 운동 [복근 핵매운맛]", "복부", 0),
("7TLk7pscICk", "SomiFit", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "복부", 0);