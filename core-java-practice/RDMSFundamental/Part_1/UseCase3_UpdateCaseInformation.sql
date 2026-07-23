USE covid_database;

UPDATE covid_cases
SET confirmed_cases = 45005000
WHERE country = 'India'
AND report_date = '2024-01-02';