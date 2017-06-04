Join  

INNER
SELECT ht.name hastane_ismi,
dr.name doktor_ismi 
FROM HASTANE.HASTANE ht
INNER JOIN 
HASTANE.DOKTOR dr ON
ht.id = dr.hastane_id;

RIGHT
SELECT ht.name hastane_ismi,
dr.name doktor_ismi 
FROM HASTANE.HASTANE ht
RIGHT JOIN 
HASTANE.DOKTOR dr ON
ht.id = dr.hastane_id;


LEFT
SELECT ht.name hastane_ismi,
dr.name doktor_ismi 
FROM HASTANE.HASTANE ht
LEFT JOIN 
HASTANE.DOKTOR dr ON
ht.id = dr.hastane_id;


Foksiyon

select toplama(dr.id,dr.hastane_id) from hastane.doktor dr;
select toplama(dr.id,dr.hastane_id) from hastane.doktor as dr;

CREATE DEFINER=`root`@`localhost` FUNCTION `toplama`(veri1 int , veri2 int) RETURNS int(11)
BEGIN
declare toplam int;
SET toplam = veri1 + veri2; 
RETURN toplam;
END


SELECT 
    CARP(h.id)
FROM
    hastane.hastane h;

CREATE DEFINER=`root`@`localhost` FUNCTION `carp`(veri int) RETURNS int(11)
BEGIN
RETURN (veri * (veri-1));
END

CREATE DEFINER=`root`@`localhost` FUNCTION `faktoriyel`(veri int) RETURNS int(11)
BEGIN
declare sonuc, sayac int;
set sonuc = 1;
set sayac = 1;
myFor:LOOP
IF sayac <= veri then
set sonuc = sayac * sonuc;
set sayac = sayac + 1 ;
ITERATE myFor;
END IF;
LEAVE myFor;
END LOOP myFor; 
RETURN sonuc;
END

SELECT 
    faktoriyel(5);





