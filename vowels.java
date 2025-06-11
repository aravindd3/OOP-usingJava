import java.util.Scanner;
public class vowels
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the charecters");
        String str=sc.nextLine();
        char[] vow={'a','e','i','o','u'};
        int countv=0;
        int countspace=0;
        int countnum=0;
        int len=str.length();
        
        int i,j;
        for(i=0;i<len;i++)
        {
            for(j=0;j<5;j++)
            {
              if(str.charAt(i) ==vow[j])
              {
                countv+=1;
                break;
              }
            }
              if(str.charAt(i)==' ' )
              {
                countspace+=1;
              }
             if(Character.isDigit(str.charAt(i)))
             {
                countnum+=1;
             }
           
        }
        System.out.println(countv);
        System.out.println(countnum);
        System.out.println(countspace);


    }
}
