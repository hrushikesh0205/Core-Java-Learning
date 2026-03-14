class calculator
{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }

    public int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
}
//same metod name different parameter  and data  types
public class Method_overloading {

    public static void main(String[] args) {
        
    calculator obj= new calculator();
    int result=obj.add(5,10);

    System.out.println("Addition is:"+result);

    }
    
}
