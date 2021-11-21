## Spring Boot 
Spring Framework kullanarak uygulama geliştirirken xml dosyaları üzerinden konfigürasyon işlemlerini yapmaktayız. Bu işlemler proje büyüdükçe vakit alabiliyor. Spring Boot ise bu vakit kaybını en aza indirmeyi planlayan bir başka Spring Freamework’üdür.

Spring Boot sadece koda odaklanmayı sağlamayı amaçlamakta olup bizi xml dosyaları üzerindeki vakit kaybını ortadan kaldırır. Xml dosyaları ile uğraşmadan Spring tabanlı uygulamaları hemen geliştirebileceğimiz Spring Boot ile yapabilecekleriniz sınırsız.

Spring Boot bu yazının yazıldığı an itibari ile 1.4.4 sürümünde Maven ve Gradle bağımlılık yönetimi ile projenize ekleyebilir ve kullanabilmeniz mümkün olmakta. Eğer projenizde maven kullanıyorsanız aşağıdaki blogu pom.xml dosyanıza eklemeniz yeterli olucaktır

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.4.4.RELEASE</version>
</parent>
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>

```

* Şayet projenizde gradle kullanıyorsanız ;
```
dependencies {
    compile("org.springframework.boot:spring-boot-starter-web:1.4.4.RELEASE")
}

```

eklemeniz yeterli olacaktır.

## Spring Boot Özellikleri
* xml configurasyonları ile uğraşmaya gerek yok
* Tomcat, Jetty ve undertow direk gömülü olarak kurulmuş bir şekilde bize sunuyor.
## Kurulum için: rest api ornek klasöründeki readme yi okuyunuz.
