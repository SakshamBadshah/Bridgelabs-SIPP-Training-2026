-- Total COVID deaths by continent

SELECT
    ct.continent_name,
    SUM(d.total_deaths) AS Total_Deaths
FROM covid_deaths d
INNER JOIN countries c
ON d.country_id = c.country_id
INNER JOIN continents ct
ON c.continent_id = ct.continent_id
GROUP BY ct.continent_name
ORDER BY Total_Deaths DESC;