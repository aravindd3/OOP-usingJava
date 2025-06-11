import java.util.Scanner;
public class index {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the word");
      String str=sc.nextLine();
      char ch='v';
      System.out.println("first occurance of charecter:"+str.indexOf(ch));
      System.out.println("last occurance of charecter:"+str.lastIndexOf(ch));

    }
    
}
