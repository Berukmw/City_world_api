USE sakila;

-- How many customers are in the database?
SELECT COUNT(*)
    , COUNT(address2)
FROM address;

SELECT *
FROM address;


-- How many films are rated PG?
SELECT COUNT(*) AS total_count
FROM film
WHERE rating = 'PG'
;


-- How many distinct ratings exist?
SELECT COUNT(DISTINCT rating) AS distinct_rating_count
FROM film
;


-- Total revenue collected: payment table
SELECT SUM(amount)
FROM payment;



-- Total revenue from customer 1:
SELECT SUM(amount)
FROM payment
WHERE customer_id = 1
;



-- Average payment amount:
SELECT SUM(amount) AS total_paid
    , SUM(amount) / COUNT(amount) AS calculated_average
    , AVG(amount) as average_paid
FROM payment;



-- Average film length:
SELECT AVG(length) AS average_film_length
FROM film;

-- Round the result: to 2 decimal places
SELECT ROUND(AVG(length), 2) AS average_film_length
FROM film;

-- Shortest movie:


-- Smallest payment:


-- Longest movie:


-- Largest payment:


-- Multiple Aggregates Together

SELECT COUNT(*)      AS FilmCount
     , ROUND(AVG(length),0)  AS AvgLength
     , MIN(length)  AS ShortestFilm
     , MAX(length)  AS LongestFilm
FROM film;