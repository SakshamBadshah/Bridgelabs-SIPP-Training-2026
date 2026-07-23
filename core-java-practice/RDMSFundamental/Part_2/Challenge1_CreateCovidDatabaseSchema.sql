-- Create Database
CREATE DATABASE covid_db;

-- Select Database
USE covid_db;

-- Create covid_cases Table
CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(100),
    state VARCHAR(100),
    report_date DATE,
    report_time TIME,
    confirmed_cases INT,
    deaths INT,
    recoveries INT
);