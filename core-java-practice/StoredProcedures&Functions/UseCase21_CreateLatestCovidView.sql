USE covid_db;

CREATE VIEW latest_covid_data AS
SELECT
    Country,
    Date,
    Confirmed_Cases,
    Deaths,
    Recoveries
FROM covid_cases c1
WHERE Date = (
    SELECT MAX(c2.Date)
    FROM covid_cases c2
    WHERE c1.Country = c2.Country
);