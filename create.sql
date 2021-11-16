CREATE DATABASE news_db;

\c news_db;

CREATE TABLE departments(
id serial PRIMARY KEY,
departmentName VARCHAR,
departmentDescription VARCHAR,
employees INT
);

CREATE TABLE users(
id serial PRIMARY KEY,
userName VARCHAR,
position VARCHAR,
role VARCHAR,
departmentId INT
);

CREATE TABLE news(
id serial PRIMARY KEY,
newsDescription VARCHAR,
newsUrl VARCHAR,
departmentId INT
);

CREATE DATABASE news_db_test WITH TEMPLATE news_db;