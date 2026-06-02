-- How many movies exist in each rating?
SELECT COUNT(rating)
    , rating
    , rental_rate
FROM film
GROUP BY rating -- this is the instruction for grouping BEFORE aggregating
    , rental_rate
ORDER BY  rating
;




-- Average movie length by rating:
SELECT AVG(length)
    , rating
FROM film
GROUP BY rating -- this is the instruction for grouping BEFORE aggregating
ORDER BY  rating
;



-- Total revenue by customer:

SELECT SUM(amount)
    , customer_id
FROM payment
GROUP BY customer_id
;

-- Top 5 spending customers: payment
SELECT SUM(amount) AS total
    , customer_id
FROM payment
GROUP BY customer_id
ORDER BY total DESC
LIMIT 5
;


-- number of Movies by rating and rental duration:
-- sort by rating and duration




/************** HAVING **************/
-- Remember:

-- WHERE filters rows
-- HAVING filters groups


-- Customers who spent more than $150:

SELECT *
FROM payment;


SELECT SUM(amount) AS total_paid
    , customer_id
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 150
;


-- Ratings with more than 200 movies:
SELECT COUNT(rating) AS movie_count
    , rating
FROM film
GROUP BY rating
HAVING COUNT(rating) > 200
ORDER BY  rating
;


-- Average movie length greater than 120 minutes:
-- having

SELECT AVG(length) as average_length
    , COUNT(*) as movie_count
    , MAX(length) as longest_movie
    , MIN(length) as shortest_movie
    , rating
FROM film
WHERE length > 120
    AND rating IN ('PG','PG-13')
GROUP BY rating
;





-- now include Only PG and PG-13 films:






-- Execution order:

-- FROM
-- WHERE
-- GROUP BY
-- HAVING
-- SELECT
-- ORDER BY