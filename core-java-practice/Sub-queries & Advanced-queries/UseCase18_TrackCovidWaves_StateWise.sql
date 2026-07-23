SELECT c1.state,
       c1.report_date,
       c1.total_cases
FROM covid_cases c1
WHERE c1.state = 'Mumbai'
AND c1.total_cases =
(
    SELECT MAX(c2.total_cases)
    FROM covid_cases c2
    WHERE c2.state = c1.state
      AND c2.report_date <= c1.report_date
);