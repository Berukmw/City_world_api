USE sakila;

-- Customers with customer_id greater than 500:
SELECT customer_id
    , first_name
    , last_name
FROM customer
WHERE customer_id > 500
;



-- Films rated PG:
SELECT film_id
    , title
    , rating
FROM film
WHERE rating = 'PG'
;



-- Films rated PG and longer than 120
SELECT film_id
    , title
    , length
    , rating
FROM film
WHERE rating = 'PG'
    AND length > 120
;



-- ALL PG and G films
SELECT film_id
    , title
    , length
    , rating
FROM film
WHERE rating = 'PG'
    OR rating = 'G'
    
;


-- ALL PG and G films rate less than $3
SELECT film_id
    , title
    , rating
    , rental_rate
FROM film
WHERE (
        rating = 'PG' 
        OR 
        rating = 'G' 
    )
    AND rental_rate < 3
    
;



-- ALL PG-13, PG, and G films IN()
SELECT film_id
    , title
    , rating
    , rental_rate
FROM film
WHERE rating IN('PG-13','PG','G')
    ;


-- Customers with customer_id 1,5,10,15, or 20
SELECT *
FROM customer
WHERE customer_id IN (1,5,10,15,20)
;



-- Films between 90 and 120 minutes:
SELECT title
    , length
FROM film
WHERE length >= 90
    AND length <= 120
;
SELECT title
    , length
FROM film
WHERE length BETWEEN 90 AND 120
;




-- Payments between $5 and $10:
SELECT *
FROM payment
WHERE amount BETWEEN 5 and 10
ORDER BY amount DESC
    , payment_date DESC
;



-- all rentals in May 2005
SELECT customer_id
    , rental_date
    , CAST(rental_date AS DATE)
FROM rental
WHERE rental_date BETWEEN '2005-05-01' AND '2005-06-01'
;




-- Titles that start with B:
SELECT title
    , release_year
    , rental_rate
    , rating
FROM film
WHERE title LIKE 'B%'
ORDER BY rental_rate
;

SELECT title
    , release_year
    , rental_rate
    , rating
FROM film
WHERE title LIKE 'B%'
ORDER BY rental_rate
LIMIT 5
;



-- Titles the end with Y:
SELECT *
FROM film
WHERE title LIKE '%Y'
;


-- Titles that contain the word LOVE:
SELECT *
FROM film
WHERE title LIKE '%LOVE%'
;



-- Single-character wildcard (_):
-- 'M___': (Starts with M and contains exactly 4 characters.)

SELECT *
FROM customer
WHERE first_name  LIKE 'M___'
;



USE northwind;

-- all employees for whom I don't know what state they live in
SELECT *
FROM employees
WHERE Region IS NULL;




-- all employees for whom I DO know what state they live in
SELECT *
FROM employees
WHERE NOT (Region IS NULL);


