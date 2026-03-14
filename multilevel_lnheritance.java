class College
{
    public void department()
    {
        System.out.println("Departmenet is come under the college");
    }
}

class division extends College
{
    public void div()
    {
        System.out.println("A.B & C division is the part of departmenet");
    }
}

class batches extends division
{
    public void batch()
    {
        System.out.println("Class divided into batches!!");
    } 
public class multilevel_lnheritance {

    public static void main(String[] args) {
        
        batches obj= new batches();

        obj.department();
        obj.div();
        obj.batch();
        
    }

}
}
