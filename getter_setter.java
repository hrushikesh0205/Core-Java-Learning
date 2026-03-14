class person
{
    private String bname;
    private String color;

    public String getName()
    {
        return bname;
    }

    public String getAge()
    {
        return color;
    }

    public void setName(String n)
    {
        bname=n;
    }

    public void setColor(String a)
    {
         color=a;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        
     person p= new person();
     p.setName("Hrushikesh");
     p.setColor("Black");

     System.out.println("Name:"+p.getName()+"\nAge:"+p.getAge());

    }
    
}
