class Human
{
    private String name;
    private int age;

    public Human()      //constructor
    {
        System.out.println("Inside constructor");
        name="Hrusikesh";
        age=21;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

}
public class constructor_exp {
    
    public static void main(String[] args) {
        
    
    Human obj= new Human();
    System.out.println("Name:"+obj.getName()+"\nAge:"+obj.getAge());


    }
}
