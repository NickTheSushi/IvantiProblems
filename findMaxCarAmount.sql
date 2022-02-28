SELECT
	manufacturer,
	model,
	price
FROM test
WHERE
(manufacturer,price) IN
	(SELECT
	manufacturer, MAX(price)
	from
	test
	GROUP BY
	manufacturer);