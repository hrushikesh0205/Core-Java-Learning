public class Anonymous_Object {

    public Anonymous_Object() {
        System.out.println("Object is created");
    }

    public void show() {
        System.out.println("in A show");
    }

    public static void main(String[] args) {
        new Anonymous_Object().show(); 
    }
}