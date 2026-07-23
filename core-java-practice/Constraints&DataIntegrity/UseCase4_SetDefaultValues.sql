-- Use Case 4: Set Default Values

ALTER TABLE covid_cases
ALTER recoveries SET DEFAULT 0;

ALTER TABLE covid_cases
ALTER last_updated
SET DEFAULT CURRENT_TIMESTAMP;