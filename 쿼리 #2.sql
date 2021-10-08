CREATE TABLE t_product(
	iproduct INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	nm VARCHAR(6)NOT null,
	price int(8)NOT null,
	company VARCHAR(8)NOT null
);

INSERT INTO t_product
(iproduct, nm, price, company)
VALUES
(1, '맥북프로', 5000000, 'apple'),
(2, '갤럭시S21', 1500000, 'samsung'),
(3, '버즈', 300000, 'samsung'),
(4, '에어팟로', 400000, 'apple');

SELECT * FROM t_product;
DROP TABLE t_product;

UPDATE t_product
SET price = 250000,
nm = '버즈프로'
WHERE iproduct = 3;

UPDATE t_product
SET company = '삼성'
WHERE iproduct IN (2,3);

DELETE FROM t_product WHERE company IN('apple','삼성');

SELECT iproduct, nm, price, company
FROM t_product;


SELECT company, COUNT(nm), SUM(price), AVG(price)
, SUM(price) / COUNT(price)
, MAX(price), MIN(price)
FROM t_product
GROUP BY company;

--외부에서 root 계정 접속 가능 체크
-- utf8 꼭 체크
-- koreait
-- 3308

	