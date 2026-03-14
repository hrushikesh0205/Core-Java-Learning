class person
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String n)
    {
        name=n;
    }

    public void setAge(int a)
    {
         age=a;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        
     person p= new person();
     p.setName("Hrushikesh");
     p.setAge(22);

     System.out.println("Name:"+p.getName()+"\nAge:"+p.getAge());

    }
    
}
