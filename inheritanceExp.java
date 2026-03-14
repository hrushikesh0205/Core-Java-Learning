class calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }

}
public class inheritanceExp {

       public static void main(String[] args) {
        
        calc obj= new calc();
        int result1=obj.add(20, 10);
        int result2=obj.sub(20, 10);

        System.out.println("Addition is:"+result1+"\nSubstraction is:"+result2);
       }
    
}