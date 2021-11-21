## Spring Boot Projesi nasıl oluşturulur ?

* https://start.spring.io/ sitesinden kurulum gerçekleşmektedir.
* Açılan ekranda maven project seçiniz.
* Language kısmında Java, kotlin ve grove dillerinden herhangi biri ile proje oluşturulabilir. Bu tutorial da java projesi oluşturulacaktır.
* Spring boot versiyon seçiniz. (Bu tutorialde 2.1.7 kullanılmıştır.)
* Project Metadata alanına şirket adı girilebilir. (Bu tutorial da com.javaCourse olarak girilmiştir.)
* Artifact alanına ise proje adı girilebilir.(Bu tutorial da springBootDemo olarak girilmiştir.)
* Dependencies kısmında ise nasıl bir yazılım geliştirme ihtiyaçlarına sahibiz ? Bu tutorial de web uygulaması geliştirileceğinden web olarak yazılmıştır.( Web yazınca çıkan Spring Web Master seçeneği seçilmiştir.)
* Generic project butonuna tıkladığımızda bu site küçük sıkıştırılmış bir dosya verecektir.
* Dosyayı bilgisayarda herhangi bir klasöre çıkartınız.
* Bu proje üzerinde geliştirme yapacağımızdan dolayı eclipse derleyicimize bu projemizi import etmemiz gerekmektedir.
* Eclipse bu projeyi import edebilmek için sırası ile : File->Import-> Existing Maven Projects -> Web den indirmiş olduğunuz projenin yolunu belirtiniz. Son olarak Finish butonuna basınız.
* Bu işlemlerden sonra eclipse bazı paketler indirebileceğinden bir süre bekleyebiliriz.
* Proje dosyaları yüklendikten sonra mvnw ve mvnw.cmd dosyaları maven yüklü olmayan derleyicilerde maven yükleme işlemi gerçekleştirir. Windows bilgisayarlarda yüklü değil ise .cmd uzantılı dosya ile yüklenebilir.


## Rest Api Örnegi:
* Bu projede rest api ile örnek bir web page açılmasını sagğlayan proje gerçekleştirilmiştir.
* Projemizde bir adet controller sınıfı oluşturalım.( Bu tutorial de ProductsDemo olarak oluşturulmuştur.)
* Daha sonra sınıf yapımızın üst kısmına @RestController  şeklinde bir annotation tanımlayalım. Bu annotation ın gelmesi için import org.springframework.web.bind.annotation.RestController; import edilmelidir.
* Bu sınıfta string döndüren bir mtedo oluşturalım. Metodun başında da bir annotation tanımlamak gerekmektedir. @GetMapping("/") şeklinde tanımlanabilir. Bu annotation sayesinde web page de anasayfa da ametod içerisinde döndürdüğümüz string değeri yazacaktır.
* @GetMapping("/ilgilisayfa") şeklinde ilgili sayfalara da yönlendirme yapılabilmektedir.
* Projeyi çalıştırmak için main metodumuzun bulunduğu sınıfta sağ tıklayıp run as deyip java application seçilmelidir. Bu sırada hata almama durumunda tarayıcımızı açıp localhost:8080 portuna gittiğimizde daha önce string metod oluşturup döndürdüğümüz string değeri sayfamızda gösterilmiş olacaktır.

  