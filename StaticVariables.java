class mobile
{
    static String Company;
    int price;
    String model;

    public void show()
    {
        System.out.println(Company+":"+price+":"+model+":");
    }
}
public class StaticVariables {

    public static void main(String[] args) {

    mobile obj1= new mobile();
    mobile.Company="Vivo";
    obj1.price=20000;
    obj1.model="Vivo V25";

    mobile obj2= new mobile();
    mobile.Company="Vivo";
    obj2.price=20000;
    obj2.model="Vivo V27";

    obj1.show();
    obj2.show();

    }    
}
