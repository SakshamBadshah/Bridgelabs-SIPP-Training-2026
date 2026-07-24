USE covid_db;

DELIMITER $$

CREATE FUNCTION CalculateMortalityRate(
    p_country VARCHAR(100),
    p_date DATE
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE mortality DECIMAL(10,2);

    SELECT (Deaths * 100.0) / Confirmed_Cases
    INTO mortality
    FROM covid_cases
    WHERE Country = p_country
      AND Date = p_date;

    RETURN mortality;
END $$

DELIMITER ;