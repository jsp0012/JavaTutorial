## Generic Sınıflar
Generic ismiyle adlandırdığımız yapılar, bir method ya da bir classın, yazılımcının türden bağımsız olarak oluşturduğu, kullanıldığı yere göre türlerinin belirlenip bu tür üzerinden işlem yapılmasını sağlayan yapılardır.
En yaygın örneği ArrayList<>'tir. ArrayList'in <>'leri içine farklı türler yazabiliyoruz ve artık listemiz bizim belirttiğimiz türlerden oluyor.

![1](https://user-images.githubusercontent.com/33198774/62416335-72671b00-b641-11e9-926e-ea422255afa5.png)


Yukarıdaki örneğimizde, isimler ArrayList'inin String, notlar ArrayList'inin türü Integer'dır fakat sonuçta ikisi de ArrayList sınıfından türemiştir. Generic bizi her nesne türü için benzer işlemleri tekrar tekrar yaptırma zorunluluğnudan kurtarmaktadır.
 
### Kendi Generic sınıfımı nasıl oluşturabilirim?
 
Bir örnek uygulama ile bu işlemin nasıl gerçekleştiğini inceleyelim:
 
Örneğimizde Liste isminde bir sınıfımız olsun. Bu lsiteye eleman ekleme ve listedeki elemanları ArrayList türünde alma işlemini gerçekleştirelim. Yalnız Liste sınıfımız herhangi bir türe bağımlı olmamalıdır.

![2](https://user-images.githubusercontent.com/33198774/62416337-73984800-b641-11e9-8482-328721f3df09.png)


##### Önemli : Liste<T> tanımlamasında T(başka bir isim de verebilirdik), bağımsız türü temsil etmektedir. 
 
##### Önemli : ekle(T eleman) tanımlamasındaki T, Liste<T>'deki T tanımlamasıdır. Liste<T> yerine Liste<TUR> olsaydı, ekle(TUR eleman) olarak düzenlemek zorunda kalacaktık.

Bu sınıfımız main methodunda çağıralım.
 
![3](https://user-images.githubusercontent.com/33198774/62416339-74c97500-b641-11e9-9a04-d8c3ce0e9124.png)

![4](https://user-images.githubusercontent.com/33198774/62416340-75faa200-b641-11e9-9eb6-0e6ab735b7d1.png)

Şimdi Integer türünden bir liste oluşturalım ve bu listeye de notlarımızı girelim.

![5](https://user-images.githubusercontent.com/33198774/62416341-772bcf00-b641-11e9-9fbe-b03e3caeca75.png)


