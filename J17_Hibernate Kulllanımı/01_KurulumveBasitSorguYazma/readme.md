## Hibernate Kullanımı

### 1. Hibernate Kurulumu

* https://hibernate.org sitesinden hibernate ORM' yi indirin.(Bu tutorial de 5.4 sürümü kullanılmıştır.)
* İndirilen sıkıştırılmış dosyayı herhangi bir dizine çıkarın.
* Çıkarılan klasörde lib/required klasörü içerisindeki jar dosyalarını ve mysql-connector-java.jar dosyasını projemize import etmemiz gerekir. Bu projede libs kalsörü içerisinde bu dosyalar mevcuttur.
* Eclipse de bu klasörleri import etmek için proje klasörüne sağ tıklayıp properties>java build path->libraries-> sekmesinde classpath e tıklayıp add jar butonuna tıkladıktan sonra açılan pencerede hibernate jar ve mysql connector jar dosyalarını import ediniz.
* Son olarak hibernate.cfg.xml dosyasını proje içine kopyalayınız. Bu dosyada projede mevcuttur.

### 2. Hibernate.cfg.xml dosya ayarları

 ```    <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/world</property> // world yerine veritabanı adı yazılır.
        <property name="hibernate.connection.username">root</property> // veri tabanı kullanıcı adı
        <property name="hibernate.connection.password">1234</property> // veri tabanı şifresi
        <property name="hibernate.connection.pool_size">1</property>
        <property name="hibernate.current_session_context_class">thread</property>
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>// Hangi türde v eri tabanı kullanılacağı belirtilir. (Burada Mysql kullanılmıştır.)
 ``` 

### 3. Veritabanı tablosunu Sınıflara atama işlemi

* Veri tabanı tablosunun adında bir sınıf oluşturulur.
* Tablodaki sütun değişkenleri ilgili sınıfta tanımlanır.
* İlgili değişkenlere ait get ve set metodları oluşturulur.
* Veri tabanı tablosundaki ilgili sütunu java sınıfında ilgili değişekene atama işlemi için annotationlar kullanılır. Kullanım için aşağıdaki resmi inceleyiniz.

![image](https://user-images.githubusercontent.com/33198774/63010518-3593f300-be8f-11e9-8a4a-a8f1772af8da.png)

### 4. Sorgu oluşturma İşlemi
* Hibernate ile sorgu olluşturmak için sessionlar kullanılır.
* Aşağıda verilen koddaki gibi sessionfactory tanımlayınız.
* Not: Aşağıdaki kod bloğunda catch işlemine gerek yoktur hibernate bunu halletmektedir.

```
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory(); //(City bizim oluşturduğumuz sınıftır.)
Session session = factory.getCurrentSession();
try{
	session.beginTransaction();
	// bu kısımda sorgu yazılır.
	List<City> cities = session.createQuery("from City").getResultList();// bu kod : select * from city sorgusuna eşittir.
	for(City city:cities){
		System.out.println(city.getName());
	}
	session.getTransaction().commit(); // olusturulan sogru commit edilmelidir.
	}

finally{
	factory.close();
}
```
### 5. Koşul ifadeli Sorgu yazımı
* HQL query yazılarak çeşitli sorgu örnekleri internetten incelenebilir.(Hibernate Query Language)
* Where örneği    :-> ```List<City> cities = session.createQuery("from City c where c.countryCode='TUR' ").getResultList();``` Bu sorgu countryCode' u TUR olan şehirleri ekrana yazdırma işlemi yapacaktır.
* Order By ornegi :-> ```List<City> cities = session.createQuery("from City c order by c.name").getResultList();``` Bu sorgu şehir adlarını alfabetik olarak sıralayıp ekrana yazdıracaktır.
* Group By ornegi :-> ```List<String> countryCodes = session.createQuery("Select c.countryCode from City c Group by c.countryCode").getResultList();``` Bu sorgu countryCode değerine göre gruplama işlemi yapar.

#### 5.1.Insert İşlemi
* Yukarda try bloğu insert işleminde değişmektedir. İlgili şehir bilgileri set metodu ile set edildikten sonra session ile kaydedip commitlemek gerekir. Örnek olarak aşağıdaki kod bloğu gösterilmiştir.

![image](https://user-images.githubusercontent.com/33198774/63092744-62b5d380-bf6b-11e9-92d4-fbbe1c2e7ba2.png)

#### 5.2.Update İşlemi
* Insert işleminde olduğu gibi update işleminde de aynı try bloğu değişmektedir.
* Veriyi çekmek için ``` City city = session.get(City.class, 2025);``` (City tablosunda 205 nolu Id ye sahip şehir bilgisini veri tabanından çeker)
* Veriyi guncellemek için set metodu kullanılır. ```city.setName("GuncellenecekYeniAd");```
* Son olarak yapılan değişiklik kaydedilip commit işlemi gerçekleştirilir. ```session.save(city);session.getTransaction().commit(); ```
* Ornek kullanım aşağıdaki resim de gösterilmiştir.

![image](https://user-images.githubusercontent.com/33198774/63093482-191ab800-bf6e-11e9-80ba-6849fbf7c1ff.png)

#### 5.3.Delete İşlemi
* Insert ve update de olduğu gibi delete işleminde de try bloğu değişmektedir.
* Update işleminde veri tabanındaki id yi alma işlemi tekrarlanır.  ``` City city = session.get(City.class, 2025);```
* Session kullanılarak silme işlemi gerçekleştirilir. ``` session.delete(city);```
* Ornek kullanım aşağıdaki resim de gösterilmiştir.

![image](https://user-images.githubusercontent.com/33198774/63093796-313f0700-bf6f-11e9-825a-4c1359cb4e63.png)


## NOT: Insert, update ve delete işlemleri yukarıdaki yöntem ile yapıldığı gibi koşul ifadeli sorgu olarak da(5.Nolu başlıkta belirtildiği gibi) yazılabilir.Tek farkı aşağıdaki gibidir.
 ```List<City> cities = session.createQuery("ilgili sql cumlesi yazılır").executeUpdate();```

