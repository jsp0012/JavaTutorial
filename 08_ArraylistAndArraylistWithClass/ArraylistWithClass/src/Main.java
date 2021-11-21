import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Furkan","Tufan"));
        customers.add(new Customer(2,"deneme","deneme"));
        customers.add(new Customer(3,"deneme2","deneme2"));

        for(Customer cs : customers)
        {
            System.out.println("adlari:"+cs.adi);
        }

    }
}
