-- Use Case 2: Create Countries Table

CREATE TABLE countries (
    country VARCHAR(100) PRIMARY KEY,
    continent VARCHAR(100),
    population BIGINT
);

-- Create Foreign Key

ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (country)
REFERENCES countries(country);