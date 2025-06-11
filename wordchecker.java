import java.util.Scanner;
public class wordchecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word to check:");
        String word=sc.nextLine();
        String sentence="welcome bye ";
        if(sentence.startsWith(word) && sentence.endsWith(word))
        {
            System.out.println("starts and ends with same word");
            
        }
        if(sentence.startsWith(word) && !sentence.endsWith(word))
        {
            System.out.println("it does start with "+word+" but does not end with it");
        }
        if(!sentence.startsWith(word) && sentence.endsWith(word)){
            System.out.println("does not start with "+word+" but ends with it");
        }
        if(!sentence.startsWith(word) && !sentence.endsWith(word))
        {
           System.out.println("does not start or end with "+word);
        }
    }
    
    
}
