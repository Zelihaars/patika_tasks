-- 1.ÖDEV
SELECT title ,length FROM film WHERE length >
(SELECT AVG(length) FROM film);


-- 2.ÖDEV
SELECT title ,rental_rate FROM film WHERE  rental_rate = 
(SELECT MAX(rental_rate) FROM film);

-- 3.ÖDEV
SELECT title ,rental_rate,replacement_cost FROM film 
WHERE  rental_rate = ANY
(SELECT MAX(rental_rate) FROM film)
AND
replacement_cost=
(SELECT MIN(replacement_cost) FROM film);

-- 4.ÖDEV

SELECT customer.first_name ,customer.last_name , COUNT(*) AS Alisveriss FROM payment INNER JOIN customer ON customer.customer_id = payment.customer_id
GROUP BY payment.customer_id ,customer.first_name ,customer.last_name 
ORDER BY count(*) DESC;