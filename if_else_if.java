public class if_else_if {

    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        int c = 40;

        if (a > b && a > c) {
            System.out.println("A is the greatest number!");
        }
        else if (b > a && b > c) {
            System.out.println("B is the greatest number!");
        }
        else {
            System.out.println("C is the greatest number!");
        }
    }
}
