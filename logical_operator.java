public class logical_operator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("AND operator:" + (a < b && b < c));
        System.out.println("OR operator: " + (a > b || b < c));
        System.out.println("NOT operator:" + !(a < b));
    }
}


