class Animal {
    public String name = "Animal";        
    private int age = 5;                  
    protected String type = "Mammal";     
    String color = "Brown";              

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
    private void secretMethod() {
        System.out.println("Private method");
    }

    public void callSecret() {
        secretMethod(); 
    }
}
class Dog extends Animal {
    public void dogShow() {
        System.out.println("Name: " + name);    
        System.out.println("Type: " + type);    
        System.out.println("Color: " + color);  
    }
}
public class AccessModifiers {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.show();
        a.callSecret();

        Dog d = new Dog();
        d.dogShow();
        System.out.println(d.name); 
        System.out.println(d.type);  
        
    }
}