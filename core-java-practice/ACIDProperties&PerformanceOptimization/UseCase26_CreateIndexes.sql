-- Use Case 26: Create Indexes on Frequently Searched Columns

USE covid_db;

-- Composite Index on Country and Date
CREATE INDEX idx_country_date
ON covid_cases (Country, Date);

-- Single Column Index on Date
CREATE INDEX idx_date
ON covid_cases (Date);