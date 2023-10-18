--1.ÖDEV 
SELECT city.city, country.country FROM city
INNER JOIN country ON city.city_id= country.country_id

--2.ÖDEV 
SELECT  customer.first_name, customer.last_name
FROM customer 
INNER JOIN payment 
ON payment.customer_id = customer.customer_id;

--3.ÖDEV
SELECT customer.first_name, customer.last_name FROM customer
INNER JOIN rental ON rental.rental_id=customer.customer_id