SELECT country
FROM covid_cases
WHERE country IN
(
    SELECT country
    FROM covid_cases
    GROUP BY country
    HAVING MAX(total_cases) > 1000000
);