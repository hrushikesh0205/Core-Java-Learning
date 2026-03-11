public class nested_while {

    public static void main(String[] args) {
        
        int i=1;

        while(i<=4)
        {
            System.out.println("Hello"+1);

            int j=1;
            while(j<=3)
            {
                System.out.println("How are you?"+j);
                j++;
            }
            i++;
        }

        System.out.println("Excution Done!!"+i);
    }
    
}
