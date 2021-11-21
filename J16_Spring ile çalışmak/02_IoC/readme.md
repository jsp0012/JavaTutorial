## Bu projede Inversion of Control yöntemi kullanılmıştır.

Inversion of Control (IoC) ise bir yazılım tasarım prensibidir ve basit tabiriyle nesnelerin uygulama boyunca ki yaşam döngüsünden sorumludur diyebiliriz. Uygulama içerisinde kullanılan objelerin instance'larının yönetimi sağlar ve bağımlılığı en aza indirgemeyi amaçlar. 

Container program içerisinde request edilen nesneleri abstraction'lara bağlı tutarak otomatik olarak oluşturan ve bağımlılıklarını inject eden bir framework diyebiliriz. Oluşturmuş olduğu bu nesneleri kendi içerisinde yönetimini yaparak tekrardan ihtiyaç duyulduğunda yeni bir instance oluşturmak yerine mevcut olan nesneyi atar.

IoC daha kolay test edilebilir loose coupling dediğimiz gevşek bağlı ve reusable bir yazılım desene oluşturmamızı sağlar.

IoC ilk başlarda implementasyonundan dolayı zor ve karmaşık gibi görünsede geliştirme yaptıkça ve sağladığı kolaylıkları fark ettikçe hayran kalınacak bir yazılım tasarım prensibidir. Basitçe işleyişini anlatmak gerekirse; soyut tiplerin hangi somut tipler tarafından register edildiği bilgisini tutar. Uygulama içerisinde container'dan abstract bir nesne talebinde bulursunuz ve size register bilgisinde tanımlı olan concrete type'ın instance'ını oluşturup verir. Bir tür object factory olarak düşünebilirsiniz.
