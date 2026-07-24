USE covid_db;

DELIMITER $$

CREATE PROCEDURE UpdateCovidStats(
    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_confirmed INT,
    IN p_deaths INT,
    IN p_recoveries INT
)
BEGIN

    UPDATE covid_cases
    SET
        Confirmed_Cases = p_confirmed,
        Deaths = p_deaths,
        Recoveries = p_recoveries,
        Last_Updated = CURRENT_TIMESTAMP
    WHERE Country = p_country
      AND Date = p_date;

END $$

DELIMITER ;