import java.util.*;

class Student{
    String name;
    int[] marks;
    int total;
    double avg;
    public Student(String name,int[] marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public int calctotal()
    {
        total=0;
        for(int m:marks)
        {
            total+=m;
        }
        return total;
    }
    public double calcavg()
    {
        avg=0;
        int len=marks.length;
        avg=calctotal()/len;
        return avg;

    }
}
public class StudentManagement {
    public static void main(String[] args) {
        HashMap<String,int[]> Students=new HashMap<>();
        Students.put("aravind",new int[]{35,46,41});
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Student:");
        String stu=sc.nextLine().toLowerCase();
        Student obj=new Student(stu,Students.get(stu));
        System.out.println("The total marks of the student is: "+obj.calctotal());
        System.out.println("The average mark of the student is: "+obj.calcavg());

    }
}
