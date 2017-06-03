** UPDATE

UPDATE Customers
SET CustomerName='Þemo'
WHERE CustomerID=1;


UPDATE Customers
SET city='ankara'
WHERE CustomerID between 1 and 10;


DELETE FROM Customers
WHERE CustomerID between 5 and 10 or ContactName = 'Mahmut';

DELETE FROM Customers
WHERE CustomerName='Alfreds Futterkiste';

Yorum Satýrý:
select * from Customers
--SET city='ankara'
WHERE CustomerID between 4 and 10;


IN

--select * from personel
--where sehir in (select sehir from musteri)

--select * from personel
--where sehir in ('ankara','hakkari','mus')


select * from personel
where sehir in ('hakkari')



CREATE TABLE MUSTAFA(
ID INT,
KISESEL_ESYA VARCHAR(50)
)

insert into mustafa (id,KISESEL_ESYA) values (1,'saat')


drop table mustafa


CREATE TABLE satis2
(
PersonID int
);
insert into satis2 values(1);
insert into satis2 values(1);

alter table SATIS2 
add NAME varchar(50);

update satis2
set name = 'mustafa'


create table turkiye(
TC int,
isim varchar(100),
Primary KEY (TC)
)


insert into turkiye values (1,'ergan')
//ikinciye izin vermez
insert into turkiye values (1,'ergan')



        



