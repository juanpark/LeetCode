SELECT user_id, product_id
FROM ONLINE_SALE
GROUP BY user_id, product_id
HAVING COUNT(product_id) > 1
ORDER BY user_id ASC, product_id DESC;