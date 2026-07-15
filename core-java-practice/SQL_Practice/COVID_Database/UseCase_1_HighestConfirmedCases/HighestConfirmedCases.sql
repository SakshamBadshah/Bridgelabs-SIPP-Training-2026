-- Find the country with the highest confirmed COVID cases on a specific date

SELECT
    c.country_name,
    cc.date,
    cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
WHERE cc.date = '2021-06-01'
ORDER BY cc.confirmed_cases DESC
LIMIT 1;