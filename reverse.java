import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String str=sc.nextLine();
        char[] rev =new char[str.length()];
        int i;
        int j=0;
        for(i=str.length()-1;i>=0;i--)
        {
          rev[j]=str.charAt(i);
          j++;

        }
         for(i=0;i<str.length();i++)
         {
        System.out.print(rev[i]);
         }

    }
    
}
