class human
{
    private int age;
    private String name;

    public String getName()
    {
        return name;
    }
 
    public void setName(String name)
    {
             this.name=name;
    }
    public int getAge()
    {
        return age;
    }

    public void SetAge(int age)
    {
        this.age=age;
    }

}
public class this_keyword {

    public static void main(String[] args) {
        
        human obj=new human();
        obj.setName("Sham");
        obj.SetAge(14);

        System.out.println("Name: "+obj.getName()+" Age: "+obj.getAge());
    }
    

}
