USE sakila;

-- Return all columns from the customer table:
-- snake_lower_case - table and column naming standard for MySQL
SELECT `Name`
    , `Continent`
FROM `world`.`country`
ORDER BY `Continent`
    , `Name`
    ;



-- Return only specific columns:
SELECT customer_id
    , first_name
    , last_name
    , email
FROM customer;


-- Customers sorted by last name:

SELECT first_name
FROM customer
ORDER BY last_name DESC
    , first_name
;




-- Customers sorted by last name, then first:

-- query the world database here
SELECT `Name`
    , `Continent`
FROM `world`.`country`
ORDER BY `Continent`
    , `Name`
    ;


-- movies sorted by release year Descending 
SELECT title
    , release_year
FROM film
ORDER BY release_year DESC
    , title;

