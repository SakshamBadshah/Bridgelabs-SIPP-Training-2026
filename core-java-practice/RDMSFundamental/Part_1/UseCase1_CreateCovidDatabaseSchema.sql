-- Create Database
CREATE DATABASE covid_database;

-- Use Database
USE covid_database;

-- Create covid_cases Table
CREATE TABLE covid_cases (
    country VARCHAR(100),
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    population BIGINT
);

-- Create covid_deaths Table
CREATE TABLE covid_deaths (
    country VARCHAR(100),
    report_date DATE,
    total_deaths INT
);

-- Create covid_vaccines Table
CREATE TABLE covid_vaccines (
    country VARCHAR(100),
    report_date DATE,
    vaccinated_people BIGINT
);