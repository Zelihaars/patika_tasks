--1.ÖDEV
SELECT city.city,country.country FROM city
LEFT JOIN country ON city.city_id=country.country_id
                    country.country_id = city.country_id;

--2.ÖDEV
SELECT payment.payment_id,customer.first_name,customer.last_name FROM customer
RIGHT JOIN payment ON payment.customer_id=customer.customer_id;

--3.ÖDEV
SELECT rental.rental_id,customer.first_name,customer.last_name FROM customer
FULL JOIN rental ON customer.customer_id = rental.customer_id;
