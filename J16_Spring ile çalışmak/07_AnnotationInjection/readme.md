Aplication context dosyasında bean oluşturmak yerine ilgili sınıfın en üst satırına @component("dataAdi")
yazılarak main metodunda data çağrılır. Ayrıntılı bilgi için projeyi inceleyin.

* Applicaton Context dosyasına eklenecek kod aşağıdadır.
* ``` <context:component-scan base-package="kullanılan_paket_adi"></context:component-scan>	```
