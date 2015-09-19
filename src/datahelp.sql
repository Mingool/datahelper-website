DROP DATABASE IF EXISTS xdatahelp;

CREATE DATABASE xdatahelp DEFAULT CHARACTER SET utf8;

USE xdatahelp;

#存放用户基本信息
CREATE TABLE user_info(
	id VARCHAR(100) PRIMARY KEY,
	username VARCHAR(100) NOT NULL UNIQUE,
	password VARCHAR(100) NOT NULL,
	nickname VARCHAR(100) NOT NULL,
	email VARCHAR(100),
	telephone VARCHAR(100),
	create_time DATE,
	token VARCHAR(100) UNIQUE DEFAULT NULL
)ENGINE=InnoDB;

#存放用户数据库信息
CREATE TABLE user_db(
	id VARCHAR(100) PRIMARY KEY,
	db_name VARCHAR(100) NOT NULL,
	db_username VARCHAR(100) NOT NULL,
	db_password VARCHAR(100) NOT NULL,
	create_time DATE,
	user_id VARCHAR(100) NOT NULL,
	CONSTRAINT user_info_user_db_id FOREIGN KEY(user_id) REFERENCES user_info(id)
)ENGINE=InnoDB;

#存放用户数据库接口统计信息
CREATE TABLE user_interface(
	id VARCHAR(100) PRIMARY KEY,
	num INT(10) DEFAULT NULL,
	user_id VARCHAR(100) NOT NULL,
	CONSTRAINT user_info_user_interface_id FOREIGN KEY(user_id) REFERENCES user_info(id)
)ENGINE=InnoDB;

#存放用户留言
CREATE TABLE user_message(
	id VARCHAR(100) PRIMARY KEY,
	content VARCHAR(100),
	time DATE,
	user_id VARCHAR(100) NOT NULL,
	CONSTRAINT user_info_user_message_id FOREIGN KEY(user_id) REFERENCES user_info(id)
)ENGINE=InnoDB;