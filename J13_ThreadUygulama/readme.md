### Thread Durumları Arasındaki Geçişler

Java’da tnımlanmış thread durumları aşağıdaki gibidir.

* NEW
  Yaratılmış ancak start edilmemiş thread’in durumudur.
* RUNNABLE
  Start edilmiş yani o an java virtual machine’de çalışan thread’in durumudur.
* BLOCKED
  Bu state’de thread monitor lock için bekletilmiş durumdadaır. Thread bloklanmıştır. Gerekli lock açıldığında yeniden runnable state’e geçebilir.
* WAITING
  Belirli bir iş parçasını yapabilmek için süresiz olarak başka threadlerin çalışmasını tamamlamasını bekleyen threadin durumu.
* TIMED_WAITING
  Kendi işini yapabilmesi için belirli bir sure içinde digger threadlerin çalışmasının bitmesini bekleyen threadin durumu.
* TERMINATED
  Çalışması durmuş ve çıkılmış olan threadin durumu.
 

1-Yeni bir thread start edildikten sonra runnable state’e geçer.

2- Thread Scheduler thread’i runnable ve running durumları arasında hızlı geçişler yaptırabilir.

3- Fiziksel olarak tek işlemcili bilgisayarlarda runnable durumunda ne kadar thread olursa olsun her hangi bir anda yalnızca tek bir thread running durumunda olabilir. Tek işlemcinin parallel işlem kapasitesi teorik olarak 1 dir.

 
4- Threadlerin start edilme sırasına göre çalıştırılmasını java garanti etmez. Önce start edilen threadin once çalışması java tarafından granti edilmez. Bu yüzden threadlerin senkronizasyonuna dikkat edilmelidir.


5- Thread içinde sleep() metodunu kullanmamız uzun süren threadler run edilirken digger threadlerin starvation yaşamasını engeller. Sleep(milisaniye); metodu çağırıldıktan sonra içindeki bekleme değerine göre geçerli thread durdurulur o sure içinde başka thread çalıştırılmaya başlanır.
 

6- Running durumunda olan bir thread wait(), sleep(),  join() metodları çağırılarak blocked veya waiting durumuna geçebilir.
 

7-  Bir thread blocked veya waiting durumuna, synchronized bir kod bloğuna girebilmek için gerekli lock’ı alamadığından dolayıda geçebilir. Synchronized tanımlanmış kod bloğu OS kavramlarından da bildiğimiz critical section kavramına denk gelir. Syncronized tanımlanmış kod bloğuna aynı anda yalnızca tek bir thread girebilir. Bu thread bu bölümünde işini bitirene kadar o bloğa girmek isteyen threadler sırada beklerler.
 

8- Sleep veya wait durumundan çıkmış veya beklediği lock  alınabilir hale gelmiş thread yeniden runnable duruma geçebilir.
 

9- Terminate edilmiş (öldürülmüş) thread yeniden start edilemez.


### Sleep, Yield ve Join Metodları

 

1- Sleep metodu ile sleep metodunu çağıran thread verilen parametre süresince uykuya alınır. Bu sure içerisinde farklı bir iş yapan thread çalıştırılabilir. Ancak sleep() metodu herhangi bir lock’ı serbest bırakmadığı için uykuya alınmış thread ile  aynı synchronized kod bloğunu çalıştırmak isteyen başka bir thread bu sleep anında çalışamayacaktır.

2- Sleep metodu ile belirli bir sure uykuya alınmış  thread’in uyku süresi bittiğinde doğrudan running state’ine geçeceğini java garanti etmez.

3- sleep metodu static bir metoddur. Bir thread başka bir thread’e sleep yapacağını söyleyemez.

4- setPriority() metodu ile thread lere öncelik atayabilriz. Öncelik değerleri 1 ile 10 arasında değerler alabilir. On yüksek öncelik bir düşük öncelik ifade eder. Bazı öncelik seviyeleri JVM tarafından eşitde kabul edilebilir.

5- Eğer geçerli tanımlanmış bir priority set yok ise tüm threadler aynı prirority seviyesinde yaratılırlar.

6- yield() metodu running durumunda olan thread tarafından çağırıldığında, bu thread’i kendisi ile aynı öncelik seviyesine sahip başka bir thread’i çalıştırmak için kısa bir süreliğine durdurur. Ama bu durum JVM tarafından yine garanti edilmez, farklı priority e sahip bir thread de çalıştırılabilir. Yield() metodu sonucunda gerekli işlemler yapıldıktan sonra yield() metodu çağıran thread yeniden hızlıca running durumuna geçer.

7- Sistemde o an çalışan threadin önceliğinden daha yüksek öncelikli bir thread sisteme dahil olursa JVM genellikle o an çalışan threadi keser ve yerine yüksek öncelikli threadi çalıştırır.

8- Bir thread join() metodunu çağırır ise o an çalışan thread join() metodunu çağıran threadin bitmesini bekler. Join’i çağıran thread işini bitirdikten sonra bekleyen thread çalışmaya devam eder.
 

### Threadlerde Senkronizasyon ve Concurrent Erişim Problemleri

1- Synchronized methodlar, tanımlanan kritik kod bloğuna aynı anda birden fazla threadin girmesini engelleyen metod tipleridir.

2- Synchronized methodlar synchronized keyword’ünü içerirler. Metodun hepsini değil belli bir kod parçasını kritik kod bloğu olarak tanımlamak istiyorsak yine synchronized keywordünü kullanıyoruz.

public synchronized void example(){

//kod bloğu

}

 

public void example(){

synchronized (mutex) {

//kod bloğu

}

}

Yukarıda tanımlanan 2 metod da birbirlerine eştirler.

3- Metod üzerinden değilde belli bir kod bloğu üzerinden senkronizasyon yapıyorsak synchronized tanımı yaparken mutlaka keyword ün içine locklanacak objeninde parametre olarak verilmesi gerekmektedir.

public void example(){

synchronized (this) {

//kod bloğu

}

}

4- Bir objeye ait birden fazla synchronized tanımlanmış metod olabilir. Ancak herhangi bir anda yalnızca tek bir thread bu metodlardan birine girip çalışabilir. Synchronized metodların sayısı kaç olursa olsun yalnızca tek bir metod aynı anda bu metodların birinde çalışabilir. Örneğin 3 synchronized metodumuz ve bu 3 farklı metoda ayrı ayrı girmek isteyen threadlerimiz olsun. Bu threadler girmek istedikleri metodlar farklı olsa bile aynı anda çalışamayacaklar. Metodlar synchronized tanımladığından dolayı. Fakat synchronized olmayan diğer metodlarda aynı anda birden fazla thread erişimi yapılabilir.

5- Bir thread synchronized code içinde sleep() metodunu çağırırsa, o kod bloğuna girerken aldığı lock’ı serbest bırakmaz. Yani o kod bloğuna girmeyi bekleyen başka thread varsa, bekleyen thread lock serbest kalmadığından beklemeye devam edecektir.

6- Static methodlar synchronized olabilir.

### Wait ve Notify Metodları ile Objeler Arası Haberleşme

1- Wait metodu o an çalışan thread’i başka bir thread’den notify() veya notifyAll() metodu çağırılana kadar bekletir. Wait() metodu çağırıldığında o an alınmış locklar hemen serbest bırakılır.

2- Notify() methodu daha önceden wait() komutu ile durdurulmuş thread’e uyan sinyali gönderir. Bu sinyal ile uyuyan thread uyanıp kaldığı yerden çalışmasına devam eder. Ancak bekleyen birden çok thread varsa notify() komutu ile hangi thread’in uyandırılacağı belirlenmez. O an hangi thread’in uyandıralcağını JVM belirler.

3- NotifyAll() metodu çağırıldıktan sonra bekleyen tüm threadlere sinyal gönderilir ve uyandırılır.

4- wait(), notify() ve notifyAll() metodları synchronized kod bloklarının içinde çağırılmak zorundadırlar. Çünkü bu komutlar lockları serbest bırakan veya lockları threadlerin ellerine geçmesini sağlayan komutlardır.

 

### Deadlocked Threads

1-Eğer threadler birbirlerinin ellerinde tuttukları lockları bekliyorlarsa, hiç bir zaman locklar serbest bırakılmayacak ve hiç bir thread ilerlyemeyecek böylelikle bir deadlock durumu meydana gelecek. Bu durumu ortadan kaldırmak için senkronizasyona ve kaynak paylaşımının zamanlamasına dikkat edilmelidir.