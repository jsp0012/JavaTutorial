public class Main {

    public static void main(String[] args) {

        System.out.println("Kendi çalışanım");
        Worker ahmet = new Worker();

        ahmet.eat();
        ahmet.work();
        ahmet.pay();
        System.out.println("------------------------");

        System.out.println("yabancı çalışan");

        OutSourceWorker yabancıcalısan = new OutSourceWorker();
        yabancıcalısan.work();
        System.out.println("------------------------");

    }
}
