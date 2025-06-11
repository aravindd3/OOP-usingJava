import java.util.Scanner;
public class Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=sc.nextLine();
        String[] word=str.split("\\s+");
        for(String s : word)
        {
            System.out.println(s);
        }
    
        

    }
}
