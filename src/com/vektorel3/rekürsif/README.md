
Bazý algoritmalar, doðalarý gereði özyinelidir. En çok bilinen özyineli algoritmalardan biri de faktöryel algoritmasýdýr. Matematikte n sayýsýnýn faktöryeli,

n!=1.2.3 ..(n-1).n

þeklinde, 1’den n’e kadar tam sayýlarýn çarpýmý þeklinde tanýmlanýr. Ayrýca 0!=1 olarak tanýmlanmýþtýr. Þimdi yukarýdaki ifadeyi,

n!=1.2.3....n=F(n)

þeklinde tanýmlarsak bu durumda,

(n-1)!=1.2.3...(n-1)=F(n-1)

olarak yazýlabilir. Buna göre,

n!=1.2.3..n=F(n)=1.2.3...(n-1).n=F(n-1).n

ifadesine eriþilecektir. Bu durumda,

F(n)=F(n-1).n

ifadesi özyineli bir ifadedir; çünkü F(n) fonksiyonunun tanýmlanmasý ve hesabý, fonksiyonun kendisine referans verilerek gerçekleþtirilir.

Þimdi, yukarýdaki tanýmlamaya göre hesaplamanýn nasýl yapýlabileceðine bakalým. Örnek bir durum olarak, n=4 durumunu ele alalým. Böylece, n=4 için,

I.  F(4)=F(3).4

II.  F(3)=F(2).3

III.  F(2)=F(1).2

IV.  F(0)=F(0).1

adýmlarý gerekecektir. F(0)=0!=1 olarak tanýmlý bir deðere ulaþýldýðýndan, IV. adýmda, F(1)=1 olarak hesaplanabilir. 

Sonra bir önceki adýma geçilerek, F(2)=1.2 =2 olarak hesaplanýr.

Daha sonra II. adýma dönülecek ve F(3)=2.3=6 olarak hesaplanýr.

Sonuçta ise I’e dönülerek F(4)=6.4=24 olarak 4! ifadesinin sonucu bulunacaktýr.

int fakt(int n)
{

    if(n<=1)
        return (1);
        
    else
        return (n*fakt(n-1));
        
}



FIBONACCI SAYILARININ ÜRETÝLMESÝ

Fibonacci dizisi,

            1,1,2,3,5,8,13,21,34,55,89,144,233,..

þeklinde tanýmlanmýþ bir sonsuz dizidir. Burada,

              F0=1   ve F1=1  alýnarak

              F2=F0+F1

             F3=F1+F2

ve genel olarak

        Fi=Fi-1+Fi-2

þeklinde tanýmlanýr.



int fibon(int n)
{

    if(n==1 || n==2)
        return (1);
        
    else
        return (fibon(n-1)+fibon(n-2));
        
}