-- Use Case 5: Add UNIQUE Constraint

ALTER TABLE covid_cases
ADD CONSTRAINT uq_country_date
UNIQUE (country, report_date);