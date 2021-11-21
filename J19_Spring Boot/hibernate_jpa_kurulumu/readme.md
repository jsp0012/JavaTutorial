## Spring Boot projesine Hibernate JPA Kurulumu

* https://start.spring.io/ adresine gidiniz.
* Proje seçiminde Maven project,Dil seçiminde Java, spring-boot versiyonu olarak 2.1.7 ayarlarını seçerek ilerleyiniz.
* GroupId olarak com.javacourse.project artifact id alanına ise hibernateAndJpa giriniz.
* Dependencies alanına ise Spring web Starter yazıp gelen seçeneği seçiniz.
* Generate project diyerek oluşturulan projeyi indirebiliriz.
* Oluşan projeyi klasöre çıkararak eclipse derleyicimize import etmemiz gerekir.
* Veri tabanı connection string için resources klasörü içerisinde application.properties dosyası içerisinde aşağıdaki kodlar yazılmalıdır.
### NOT: Bu projede Mysql kullanıldığından dolayı connection string ona göre ayarlanmıştır.
```
spring.datasource.url=jdbc:mysql://localhost:3306/world			// connection stringdir
spring.datasource.username=root						// veri tabanı kullanıcı adı
spring.datasource.password=1234						// veri tabanı şifresidir

```

* src/main/java klasörü içerisinde default paketimize sağ tıklayıp entitiy isminde bir paket oluşturunuz.(Bu paket içerisinde veri tabanı tablolarımıza ait sınıflar tasarlanacaktır.)
* Oluşturulan paket içerisinde veri tabanı tablosuna ait olacak şekilde sınıf adı oluşturunuz.( Bu tutorialde City isimli sınıf oluşturulmuştur.)
* Oluşturduğunuz sınıfta veri tabanı kolonlarına ait değişkenleri tanımlayıp tüm değişkenleri parametre olarak alan bir constructor tanımlayınız.
* Tanımlanan değişkenlere ait get ve set metodlarını tanımlayınız.
* Bu sınıfı veri tabanı tablosu olarak atamak için annotationlar eklememiz gerekir.
* İlk olara pom.xml dosyasına bir dependency eklenmesi gerekiyor. Kodu aşağıdan kopyalayabilirsiniz.
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
* Daha sonra ilgili sınıfımızda import javax.persistence.*; import etmemiz gerekir.
* Sınıfımızın bir entitiy olduğunu belirtmek için importların hemen altına @Entity ve veri tabanınında hangi tabloya bağlanmak istiyorsak onun adını tanımlayıcı olarak @Table(name="city") yazmamız gerekir.
* Son aşamamız ise değişkenlerimizi tablo kolonları ile eşlememe olacaktır.
* Id değişkeninin üzerine **@Id** ve **@Column(name="ID")** annotationları eklenmelidir. Id alanı otomatik artacak ise **@GeneratedValue(strategy=GenerationType.IDENTITY)** eklenmelidir. 
* Diğer değişkenlerin üzerine ise sadece **@Column(name="ilgiliKolonAdi")** eklenmelidir.

### Not: Bu yapılanlar proje içerisinde mevcuttur. Oluşturulan sınıf içeriğine https://github.com/furkantufan/JavaTutorial/blob/master/J19_Spring%20Boot/hibernate_jpa_kurulumu/hibernateAndjpa/src/main/java/com/javacourse/project/hibernateAndjpa/Entities/City.java dan erişilebilir.
