-- Use Case 30: Demonstrate Isolation Levels

USE covid_db;

-- Session 1
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;

START TRANSACTION;

UPDATE covid_cases
SET Confirmed_Cases = Confirmed_Cases + 100
WHERE Country='India';

-- Do NOT commit yet

--------------------------------------------------

-- Session 2 (Dirty Read)

SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;

SELECT *
FROM covid_cases
WHERE Country='India';

--------------------------------------------------

-- Prevent Dirty Read

SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;

--------------------------------------------------

-- Prevent Non-Repeatable Read

SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;

--------------------------------------------------

-- Prevent Phantom Read

SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;