DROP TABLE IF EXISTS cats;
ALTER TABLE cats ADD CONSTRAINT uc_name UNIQUE (name);

CREATE TABLE cats(
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  sex VARCHAR(10) NOT NULL,
  age INTEGER NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO cats(name,sex,age) VALUES("おもち","メス",2);
INSERT INTO cats(name,sex,age) VALUES("コア","オス",3);
INSERT INTO cats(name,sex,age) VALUES("ゴンち","オス",5);
