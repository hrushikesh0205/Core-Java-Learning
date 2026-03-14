public class type_casting {

    public static void main(String[]args)
    {

        byte a=10;
        byte b=30;
        
        int num=100;
        double val=num;
        //smaller--->bigger
        System.out.println("Type Conversion:\n"+"Integer value:"+num+"\n"+"Double value:"+val);

        double val1=50.05;
        int val2=(int)val1;
        //bigger-->smaller
        System.out.println("Type casting:\n"+"Double value:"+val1+"\n"+"Integer value:"+val2);
    }
}
