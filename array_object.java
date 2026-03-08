class student
{
    String name;
    int marks;
}

public class array_object {

    public static void main(String[] args) {

        student stud1=new student();

        stud1.name="Raj";
        stud1.marks=88;

        student stud2= new student();
        stud2.name="Sham";
        stud2.marks=90;

        student students[]= new student[2];
        students[0]=stud1;
        students[1]=stud2;

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].name+" :"+students[i].marks);
        }
        
    }
    
}
