## Bu proje ile amaçlanan application context xml dosyasından kurtulmaktır.
* Bu işlem config classlar oluşturularak gerçekleştirilmektedir.
# Not: Bu yöntem ile çağırmak istediğimiz sınıfın başına @Component("database") yazılmalıdır. Mysql ve Oracle sınıflarının her ikisinde de bu yöntemi oluşturursak hata alırız.
# Bu yöntemi daha dinamikleştirmek için bean oluşturmak gereklidir. Bean oluşturma işlemi ise bir sonraki tutorialda gösterilmiştir.
```
* Config sınıfında sınıf oluşturulmadan @Configuration ile bu sınıfın bir config sınıf olduğu belirtilmektedir.
* @ComponentScan("paketAdi") burada ise hangi paketin içerisindeysek o paketin adını vermemiz gerekir.
```
* Main metodunda ise AnnotationConfigApplicationContext sınıfından nesne oluşturup bu yapıya config sınıfımızı parametre olarak vermeliyiz.
```
Örneğin: AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(configClassAdi.class);
```
 