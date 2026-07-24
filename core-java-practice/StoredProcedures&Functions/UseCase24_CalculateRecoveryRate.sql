USE covid_db;

DELIMITER $$

CREATE FUNCTION CalculateRecoveryRate(
    p_country VARCHAR(100)
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN

    DECLARE recovery DECIMAL(10,2);

    SELECT (Recoveries * 100.0) / Confirmed_Cases
    INTO recovery
    FROM covid_cases
    WHERE Country = p_country
    ORDER BY Date DESC
    LIMIT 1;

    RETURN recovery;

END $$

DELIMITER ;