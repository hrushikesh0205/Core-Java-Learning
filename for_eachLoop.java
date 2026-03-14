class student
{
    String name;
    int marks;
}
public class for_eachLoop {

    public static void main(String[] args) {
        
        student s1= new student();
        s1.name="Deep";
        s1.marks=80;

        student s2= new student();
        s2.name="Ajay";
        s2.marks=70;

        student students[]=new student[2];
        students[0]=s1;
        students[1]=s2;

        for(student stud: students)
        {
           System.out.println(stud.name+":"+stud.marks+":");
        }
    }
    
}
