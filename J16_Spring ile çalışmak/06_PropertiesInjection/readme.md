# Bu proje ile birden fazla aynı metinsel atama yapılması işlemi gerçekleştirilmiştir.

* Herhangi bir value birden fazla bean tagları içinde kullanılırsa kendi kendimizi tekrar ederiz bu iyi bir yöntem değildir. Bunun önüne geçmek için paketimize .properties uzantılı bir dosya eklemeliyiz.
''' Eklenen dosyaya tip ve değer ataması yapılmalıdır.
Örnegin database.ConnectionString=atanacak_deger database.ConnectionString burada çağıralcak değişken tipidir.'''

* Daha sonra applicationContext.xml dosyasında <context:property-placeholder location="classpath:dosyaAdi.properties" />(Properties Uzantılı dosyamızın adı ve uzantısı)
* Son olarak kullanılacak bean taglarındaki value kısmı value="${database.ConnectionString}"eklenmelidir. Detaylar için projeyi inceleyiniz.


