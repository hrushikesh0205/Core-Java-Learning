
//final - variable -  to make it constant         method-stop overriding        class- to stop inheritance
final class  A
{
     public final void show()
     {
        System.out.println("Final Keywords!!");
     }
}

public class finalKeywords {

    public static void main(String[] args) {
        
        final int a=10;
        
        System.out.println("Vlaue is:"+a);

        A obj=new A();
        obj.show();
    }
    
}
