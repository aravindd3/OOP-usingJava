import java.util.*;
public class Stringmanipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "I AM A PROUD VITIAN";
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'VITIAN' with 'STUDENT': " + str.replace("VITIAN", "STUDENT"));
        System.out.println("Contains 'PROUD'? " + str.contains("PROUD"));
        System.out.println("Character at index 5: " + str.charAt(5));

        System.out.println("Substring from index 7 to 11: " + str.substring(7, 12));


        System.out.println("Index of 'A': " + str.indexOf('A'));

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);


        char[] charArray = str.toCharArray();
        System.out.print("Character Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();


        String newStr = str.concat(" AND I LOVE CODING");
        System.out.println("Concatenated: " + newStr);


        System.out.println("Equal'I AM A PROUD VITIAN'? " + str.equals("I AM A PROUD VITIAN"));
        System.out.println("Equal 'i am a proud vitian'? " + str.equalsIgnoreCase("i am a proud vitian"));


        System.out.println("Starts with 'I AM'? " + str.startsWith("I AM"));
        System.out.println("Ends with 'VITIAN'? " + str.endsWith("VITIAN"));


        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("Add the number in the array:");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array entered is:");
        for(int i=0;i<arr.length;i++){
            System.out.println("THe array is at:"+(i+1)+"-->"+arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}