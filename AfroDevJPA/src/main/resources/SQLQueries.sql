/* Create Database */
CREATE DATABASE jpaDemoDb;

/* Use The Newly Created Database */
USE jpaDemoDb;

/* Creating Table */
CREATE TABLE farmer (
  id INTEGER NOT NULL,
  name VARCHAR(120) NOT NULL,  
  village VARCHAR(200) NOT NULL,
  PRIMARY KEY(id)
);

DESC farmer;