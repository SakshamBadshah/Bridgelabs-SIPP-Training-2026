-- Use Case 3: Add NOT NULL Constraints

ALTER TABLE covid_cases
MODIFY country VARCHAR(100) NOT NULL;

ALTER TABLE covid_cases
MODIFY report_date DATE NOT NULL;

ALTER TABLE covid_cases
MODIFY confirmed_cases INT NOT NULL;

-- Add CHECK Constraint

ALTER TABLE covid_cases
ADD CONSTRAINT chk_deaths
CHECK (deaths <= confirmed_cases);