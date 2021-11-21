## Bir kütüpanenin maven da bulunup bulunmadığını kontrol etmek için:
1- https://mvnrepository.com/ </br>
2- https://search.maven.org/

## Maven Projesi Oluşturma

* File->New->Other->filter alanına maven yazılır.Maven Project seçilip next den sonra tekrar next yapılır.
* Bir sonraki pencere de Artifact Id sutunundan maven-archetype-quickstart seçilir.(Bu adımda çeşitli seçimler yapılabilir.)
* Sonraki pencere de ise Group Id, Artifact Id, versiyon seçimi yapılır.Bu adım maven projelerinde adresleme işlemi gerçekleştirir.
* Group Id alanına com.sirket adı seklinde isim verilir.
* Artifact Id alanı ise o şirketin hangi projesinin olduğu belirtilir.
* Versiyon ise projenin hangi versiyon olduğunu söylemektedir. Bu adım da değişiklik yapılması zorunluluk değildir. Son olarak finish işlemi gerçekleştirilir.

## Projede Kullanılacak JDK sürümü belirleme

* pom.xml dosyasında properties tagları arasına aşağıdaki kodlar yazılır.
``` 
<maven.compiler.target>1.11</maven.compiler.target>
<maven.compiler.source>1.11</maven.compiler.source> 
```
Dosya kaydedilir. Burada 1.11 jdk sürümü kullanılmıştır.
* Bu işlemden sonra ise projeye sağ tıklayıp maven->update project seçilir. En alttaki 3 tik seçili olmalıdır.(Update-Refresh-Clear)

## Maven projesine kütüphane ekleme

* Yukarda belirtilen ilk sitede hibernate yazıp aratıldığında Orm sürümü seçilip ilgili sürüm numarası seçildiğinde site bize aşağıdaki kodu vermektedir.
```
<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.1.Final</version>
</dependency>
```
* Bu kod pom.xml dosyası içerisine <dependencies> tagları arasına yapıştırılarak ilgili kütüphaneyi maven projemize dahil etmiş olmaktayız.

## Maven ne işe yarar?
Maven, proje geliştirirken proje içerisinde bir standart oluşturmamızı, geliştirme sürecini basitleştirmemizi, dokümantasyonumuzu etkili bir şekilde oluşturmamızı, projemizdeki kütüphane bağımlılığını ve IDE bağımlılığını ortadan kaldırmamızı sağlayan bir araçtır.

## Maven’in Amaçları Nelerdir ?
* Projenin geliştirme adımlarını kolaylaştırmak
* Standartlaştırma
* Projenin niteliklerini bilgi olarak sağlamak
* Tekrar kullanılabilirlik
* Kararlılık
* Bağımlılık yönetimi
* Ölçeklenebilirlik

## POM Nedir ?
Proje Nesnesi Modeli (Project Object Model) veya POM, Maven’deki temel iş birimidir. Proje kurmak için Maven tarafından kullanılan proje ve yapılandırma detayları hakkında bilgi içeren bir XML dosyasıdır.POM, Maven 1’deki project.xml’den Maven 2’de pom.xml’ye dönüştürüldü. Bir görevi veya hedefi yürütürken; Maven, geçerli dizinde POM’u arar. POM’u okur, gerekli yapılandırma bilgisini alır, sonra hedefi yürütür.
POM’de belirtilebilecek bazı yapılandırmalar proje bağımlılıkları, çalıştırılabilecek eklentiler veya hedefler, yapı profilleri, proje sürümü, açıklama, geliştiriciler, posta listeleri ve benzerleri gibi diğer bilgiler de belirtilebilir.

## Maven’in faydaları nelerdir ?
Maven, proje kalıpları(pom.xml) sayesinde IDE bağımlılığı olmadığından dolayı kurulumda esneklik sağlar. Yeni bir proje oluşturacağınızda Maven proje kalıplarını kullanabilirsiniz, bu kalıplar birer standart haline geldiği için tüm IDE ‘lerde desteklenmektedir.
Projede kullanılacak tüm kütüphaneler ve eklentiler POM(Project Object Model) dosyasından kolayca yönetilebilmektedir. Maven, kütüphane dosyalarını kendi repository sunucularında barındırır. Projede kullanmak istediğiniz kütüphane dosyalarını ilk olarak sizin local repository klasörünüzde arar, eğer bulamazsa kendi sunucularında arama yapar, eğer kendi sunularında da bulamazsa sizin tanımlayacağınız bir sunucu adresinden dosyayı sizin local klasörünüze indirir ve projeniz içerisinde kullanabilmenizi sağlar. Ayrıca bir kütüphane başka kütüphanelere bağımlıysa bu bağımlı olduğu kütüphaneleri de indirir ve projenize ekler.
Projenizin build ya da deploy yapılandırmalarını POM dosyasından yönetebilirsiniz. Büyük çaplı bir projenin, farklı sunucu sistemlerinde ya da farklı veri tabanlarında eş zamanlı olarak çalışması gerekebilir. Bunun için her güncelleme sırasında farklı yapılandırma ayarlarıyla bu sistemleri güncellememiz gerekir. Her sistem için yapılandırma dosyalarını baştan düzenlemek oldukça yorucu bir iş. Ancak POM dosyasında tanımlanacak yapılandırma ayarları işimizi görecektir. Sadece yapılandırma adını değiştirerek proje çıktısını farklı sistemlere uygun hale getirebilirsiniz.
Sürüm yönetimi, her Maven projesinin bir grup id ‘si, bir yapı id ‘si ve bir de sürüm numarası vardır. Projenin farklı sürümlerini saklayabilir ve bunları daha sonra yeni projelerde kullanabiliriz.
