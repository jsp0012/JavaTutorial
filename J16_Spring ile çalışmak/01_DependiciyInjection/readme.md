## Spring intro projesinde dependicy Injection tasarım kalıbı kullanılmıştır.
#### Dependency Injection, S.O.L.I.D prensiplerinin 5. ayağını oluşturan “Dependency Inversion” prensibinin uygulanmasını içeren bir design patterndir.

Uygulamalar geliştirilirken bir sınıfa ait bilgilerin başka bir sınıfta kullanılması gerektiğinde ilk sınıfa ait bilgileri bir nesneye atanır ve diğer sınıfa yönlendirilir. Ya da bazı durumlarda new anahtar kelimesi ile kullanım yerinde o sınıfa ait bir nesne yaratılır.

Nesnelerin birbiri ile ilişkili olduğu bu tip durumlar iyi yönetilmez ya da iyi tasarlanmaz ise uygulama dar boğaza sürüklenmeye başlar. Yani uygulama büyüdükçe yapılan en ufak bir geliştirme uygulamanın birçok yerini etkileyebilir. Böyle durumlarda geliştirmeye devam etmek ya da yeni modüller eklemek zorlaşacak, belki de imkansız olduğu noktalar oluşacaktır.

Bir nesne yapması gereken işleri başka bir nesnenin yardımıyla yapıyor ya da o nesne olmadan yapamıyorsa, söz konusu nesne diğer nesneye bağımlıdır denilir.

Uygulamalar modüler ve geliştirmeye açık olmalıdır. Bunun için de nesneler arası bağlar mümkün olduğunda gevşek, yönetilebilir şekilde tasarlanmalıdır. Bir nesne ve/veya bir sınıf üzerinde değişiklik yapıldığında sınıf ile ilişkili ya da o sınıfın nesnesini kullanan tüm diğer sınıflar ve modüller bu değişiklikten etkilenmemelidir.

Sınıflar arası ilişkide kullanılan tasarım yapısına bağlı olarak yazılımın geliştirme kalitesi ortaya çıkmaktadır. Modülerlik ve geliştirmeye açıklık ne kadar yüksek ise yazılımın kalitesi o derece yüksektir denilir. İşte Dependency Injection burada devreye giriyor.

Uygulama içerisindeki herhangi bir sınıf, kullanacağı nesnelerin davranışlarını bilmeden ve o davranışlardan doğrudan etkilenmeden o nesneyi kullanabilmelidir. Bu sınıf ilgili nesneye runtime da erişmeli ve ihtiyacı olan bilgileri elde etmelidir. Nesne kullanıldığı sınıf içerisinde doğrudan tanımlanmış olmamalıdır.

Nesneyi kullanan sınıfın da bir nesne olduğunu varsayarsak, sınıf içerisinde tanımlanan nesne ile kendisi arasında sıkı bir bağ oluşacaktır. Bu bağ ile herhangi bir nesnede yapılacak değişiklik diğerlerini de etkileyecektir. Buna bağ değil, bağımlılık denir. Yani nesneler birbirlerine canı gönülden bağlıdırlar. Bu bağ geliştirmenin her aşamasında kendisini gösterecektir.

Örneğin herhangi bir nesneyi gerekli olan her sınıfta new ile yarattığımızı düşünelim, her sınıf bu nesnenin davranışlarına doğrudan bağımlı hale gelecektir. Bu ne geliştirme esnekliği açısından ne temiz kod açısından çok şık durmayacaktır.

* Dependency Injection, bir nesne yaratma / atama metodolojisidir. Yani nesneye erişme tasarımıdır. Bu tasarım ne kadar esnek olursa uygulama gelişime o kadar açık olacaktır. Yine bu metodoloji bizi doğru tasarım kullanımına zorlayacağından modülarite ve kod okuma kalitesini artıracaktır.

Dependency Injection ile nesne atamaları dinamik hale getirilmektedir. Bir başka ifade ile Dependency Injection ile uygulamanın çalışırken kullanacağı nesneler dışarıdan enjekte edilmektedir. Bu sayede ileride oluşabilecek herhangi bir değişiklikte uygulamanın tümünün değil belirli bölümlerinin değiştirilmesi yeterli olacaktır.