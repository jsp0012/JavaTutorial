-Birden fazla catch bloğu kulanılabilir.
-Birden fazla catch bloğu kullanıldığında sadece ilgili hatayı yakalayacak blok çalışır.
-Örneğin array index out of bound exception hatası içeren bir kod yazdığınızda catch bloğunuz array index out of bound exception
 içermelidir. Yada en genel hata sınıfı olan exception bloğu içermelidir. İkisini de içerdiği durumda array out of bound exception bloğu çalışır. Exception bloğu çalışmaz. 

-örnek uygulamayı inceleyebilirsiniz.


