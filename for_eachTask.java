public class for_eachTask {

    public static void main(String[]args)
    {
        int numbers[]={30,47,90,20,56};

        int min=numbers[0];
        int max=numbers[1];

        for(int value: numbers)
        {
            if(value<min)
            {
                min=value;
            }
            if(value>max)
            {
                max=value;
            }
        }
        System.out.println("Minimum value is:"+min);
        System.out.println("Maximum value is:"+max);

    }
    
}
