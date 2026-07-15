-- Average daily deaths across all countries

SELECT
    date,
    AVG(new_deaths) AS Average_Daily_Deaths
FROM covid_deaths
GROUP BY date
ORDER BY date;