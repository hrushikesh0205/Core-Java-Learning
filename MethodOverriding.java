class calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class AdvanceCalc extends calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;

    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        
        AdvanceCalc obj=new AdvanceCalc();
        int result=obj.add(10, 20);
        System.out.println(result);

    }
    
}
