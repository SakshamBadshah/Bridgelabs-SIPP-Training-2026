-- Display deaths and vaccination status of all countries

SELECT
    c.country_name,
    d.date,
    d.total_deaths,
    v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id
AND d.date = v.date
INNER JOIN countries c
ON d.country_id = c.country_id
ORDER BY c.country_name;