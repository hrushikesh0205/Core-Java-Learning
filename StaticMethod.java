class Mobile
{
    static String company;
    int price;
    String model;

    public void show()
    {
        System.out.println(company + " : " + price + " : " + model);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(company + " : " + obj.price + " : " + obj.model);
    }
}

public class StaticMethod
{
    public static void main(String[] args)
    {

        Mobile obj1 = new Mobile();
        Mobile.company = "Vivo";
        obj1.price = 20000;
        obj1.model = "Vivo V25";

        Mobile obj2 = new Mobile();
        obj2.price = 25000;
        obj2.model = "Vivo V27";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}