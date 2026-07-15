-- Countries ranked by infection rate

SELECT
    c.country_name,
    cc.confirmed_cases,
    c.population,
    (cc.confirmed_cases * 100.0 / c.population) AS Infection_Rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY Infection_Rate DESC;