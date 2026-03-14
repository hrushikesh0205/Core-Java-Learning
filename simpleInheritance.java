class Animal
{
    public void eat()
    {
        System.out.println("Animals eat food!!");
    }
}

public class  simpleInheritance extends Animal{

    public void exp()
    {
        System.out.println("Example of Simple Inheritance");
    }

    public static void main(String[] args) {

        simpleInheritance obj= new simpleInheritance();

        obj.eat();
        obj.exp();
        
    }
    
}
