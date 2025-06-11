import java.util.Scanner;
public class palindrome
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String str=sc.nextLine();
        int len=str.length();
        int l=0;
        int r=len-1;
        boolean pal=true;
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
               pal=false;
               break; 
            }
            l++;
            r--;
        }
        if(pal){
            System.out.println(" palindrome");
        }
        else
        {
            System.out.println(" not a palindrome");
        }
        

    }
}
