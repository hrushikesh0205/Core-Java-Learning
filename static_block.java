public class static_block {

    static int x;
    static int y;

    static
    {
        x=20;
        y=30;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        
        System.out.println("X="+x);
        System.out.println("Y="+y);
    }
    
}
