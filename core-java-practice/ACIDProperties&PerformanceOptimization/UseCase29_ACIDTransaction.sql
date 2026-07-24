-- Use Case 29: ACID Transaction

USE covid_db;

START TRANSACTION;

INSERT INTO covid_vaccines
(Country, Date, Vaccinated)
VALUES
('India', '2022-01-01', 900000000);

INSERT INTO covid_vaccines
(Country, Date, Vaccinated)
VALUES
('USA', '2022-01-01', 250000000);

COMMIT;

-- If any statement fails
-- Execute:
-- ROLLBACK;