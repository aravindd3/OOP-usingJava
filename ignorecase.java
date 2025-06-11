import java.util.Scanner;
public class ignorecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String w1=sc.nextLine();
        System.out.println("enter word to compare");
        String w2=sc.nextLine();
        if(w1.equalsIgnoreCase(w2))
        {
            System.out.println(" equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
