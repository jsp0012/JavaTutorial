public class Worker implements Iworkable,Ieatable,Ipayable{
    //bu sınıf bizim çalışanlarımızı kasterder.

    @Override
    public void work() {
        System.out.println("para odendi");
    }

    @Override
    public void eat() {
        System.out.println("yemek yedi");
    }

    @Override
    public void pay() {
        System.out.println("ucret odendi");
    }
}
