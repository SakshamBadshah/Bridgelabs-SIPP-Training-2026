-- Use Case 27: Optimize Top 10 High Infection Rate Queries

USE covid_db;

-- Add infection_rate column if it doesn't exist
ALTER TABLE covid_cases
ADD COLUMN infection_rate DECIMAL(10,2);

-- Create Covering Index
CREATE INDEX idx_infection_rate
ON covid_cases (infection_rate, Country);

-- Query using the index
SELECT Country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;