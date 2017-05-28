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


