-- SELECT = getting data
SELECT * FROM Products;

-- WHERE
SELECT * FROM Products 
WHERE UnitPrice < 50;

-- ORDER BY
SELECT * FROM Products 
WHERE UnitPrice < 50
ORDER BY ProductName DESC;

-- AND, OR
SELECT * FROM Products 
WHERE UnitPrice < 50 AND UnitsInStock > 10
ORDER BY ProductName DESC;

-- BETWEEN
SELECT * FROM Products 
WHERE UnitPrice BETWEEN 10 AND 20
ORDER BY ProductName DESC;

-- LIKE
SELECT * FROM Products 
WHERE ProductName LIKE '%choco%' 
ORDER BY ProductName DESC;

-- SELECT DISTINCT
SELECT DISTINCT SupplierId FROM Products;

-- AGGREGATE COUNT, SUM, AVG, MIN, MAX
SELECT COUNT(*) FROM Products; -- how many products there are
SELECT AVG(UnitPrice) FROM Products; -- avg product price
SELECT MIN(UnitPrice) FROM Products; -- cheapest product
SELECT MAX(UnitPrice) FROM Products; -- most expensive product
SELECT SUM(UnitsInStock) FROM Products; -- total number of products in stock

-- GROUP BY
SELECT SupplierID, COUNT(*) FROM Products
GROUP BY SupplierID;

SELECT SupplierID, MAX(UnitPrice) FROM Products
GROUP BY SupplierID;

-- HAVING
SELECT SupplierID, MAX(UnitPrice) AS MostExpensiveProduct FROM Products
GROUP BY SupplierID
HAVING MostExpensiveProduct > 40;

-- JOINS
SELECT * FROM Products
JOIN Suppliers
ON Suppliers.SupplierID = Products.SupplierID;

SELECT Suppliers.SupplierID, CompanyName, MAX(UnitPrice) AS MostExpensiveProduct FROM Products
JOIN Suppliers
ON Suppliers.SupplierID = Products.SupplierID
GROUP BY SupplierID
HAVING MostExpensiveProduct > 40;



-- INSERT INTO

-- UPDATE

-- DELETE