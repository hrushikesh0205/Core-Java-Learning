class Computer
{
    public void playmusic()
    {
        System.out.println("Music is playing...");
    }

    public String getApen(int cost)
    {
        if(cost>=10)
        {
        return "Pen";
        }
        else
        {
            return "Nothing";
        }
    }
}

public class Method {

    public static void main(String[] args) {
        
        Computer comp= new Computer();
        comp.playmusic();
        String str= comp.getApen(10);

        System.out.println(str);
    }
    
}
