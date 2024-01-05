import java.util.Scanner;
public class FirstJava8 {
    //q8 To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string here: ");
        String s = sc.nextLine();
        //if it was to check palindrome for a number- BINARY SEARCH would be more optimal
        //but for strings, reversing and then checking is better
        //lets store this in a buffer variable s1
        String s1= s;
        //lets reverse it and put it in another variable s2
        String s2="";
        //lets calculate the length to initialize the reversal of string
        int len = s.length();

        for (int i = len-1; i>=0; i--) {
            s2 = s2 + s.charAt(i);
        }
        //System.out.println(s2);
        //lets compare both the strings for palindrome
        if (s2.equals(s1)) {
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
        sc.close();
    }

}
