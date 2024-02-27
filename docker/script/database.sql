CREATE DATABASE IF NOT EXISTS profile_db;

USE profile_db;

CREATE TABLE profile(
    name varchar(50),
    age int
);

CREATE TABLE profile_log(
    id BIGINT primary key auto_increment,
    name varchar(50),
    age int,
    created_at timestamp
);
