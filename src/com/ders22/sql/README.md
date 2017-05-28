Temel SQL

**SELECT

https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all


select orderid from orders;

select orderid as java20 from orders ;

//yapýlmamasý gerekli
select OrderID as veri1, CustomerID veri1 from orders ;


select orders.OrderID as veri1, CustomerID veri2 from orders

SELECT vek.unit FROM Products vek


SELECT t.SupplierID sup, v.ShipperID ship FROM Suppliers t, Shippers v


**WHERE

SELECT * FROM Orders
Where ShipperID = 2

SELECT v.ShipperID asd, m.ShipperID dsa FROM Orders as v, shippers m
Where v.ShipperID = 2


SELECT * 
	FROM Orders
	WHERE CustomerID = 81 
    	  AND
          ShipperID = 2
          
          
SELECT * 
	FROM Orders
	WHERE (CustomerID = 81 
    	  OR
          ShipperID = 2) AND EmployeeID = 6
          
SELECT * 
	FROM OrderDetails
    WHERE ORDERID = 10248
    	  AND
          (ProductID = 11
          OR
          Quantity = 5)
          
Like
 LIKE '%Fr%' hepsinde ara
 LIKE '%Fr' sondan ara
 LIKE 'Fr%' baþtan ara      
  
 SELECT * FROM [Customers]
WHERE CustomerName LIKE '%Fr%'
		AND
        City = 'Berlin'


SELECT * FROM [Orders]
WHERE EmployeeID BETWEEN 3 AND 4   

ASC-DESC
SELECT * FROM Customers
WHERE Country LIKE '%e%'
ORDER BY Country ASC, Address DESC;

SELECT * FROM Customers
WHERE CustomerID BETWEEN 50 AND 100
ORDER BY CustomerID DESC;

**INSERT
        
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Mustafa','Vektorel','ankara','Ankara','4006','Türkiye');
                            

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode,Country)
VALUES ('Mustafa2','Vektorel','ankara','Ankara','4006',null);


INSERT INTO Customers
VALUES (160,'Mustafa5','Vektorel','ankara','Ankara','4006',null);
