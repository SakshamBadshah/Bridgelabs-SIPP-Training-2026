-- Use Case 1: Define Composite Primary Key

ALTER TABLE covid_cases
ADD CONSTRAINT pk_covid_cases
PRIMARY KEY (country, report_date);