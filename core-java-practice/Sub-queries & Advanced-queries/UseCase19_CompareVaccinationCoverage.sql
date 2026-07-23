SELECT country,
       vaccinated_people AS people,
       'Vaccinated' AS status
FROM covid_vaccines

UNION

SELECT country,
       (population - vaccinated_people) AS people,
       'Unvaccinated' AS status
FROM covid_vaccines;