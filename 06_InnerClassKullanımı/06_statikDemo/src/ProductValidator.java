public class ProductValidator {
    static
    {
        System.out.println("static metod çalıştı");
    }

    public ProductValidator()
    {
        System.out.println("constructor çalıştı");
    }

    public static boolean isValid(Product pr)
    {
        if((pr.fiyat>0 && !pr.adi.isEmpty()))
        {
           return true;
        }
        else
            return false;

    }
}
