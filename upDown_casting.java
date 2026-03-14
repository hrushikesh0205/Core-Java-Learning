class A {
    public void show1() {
        System.out.println("in A's show1 method");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B's show2 method");
    }
}

public class upDown_casting {
    public static void main(String[] args) {
        
        A obj = new B();    

        B obj1 = (B) obj;   
        obj1.show2();       
    }
}