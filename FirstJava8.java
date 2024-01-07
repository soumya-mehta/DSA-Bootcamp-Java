import java.util.Scanner;
public class FirstJava8 {
    //q8 To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string here: ");
        String s = sc.nextLine();
        String s1= s;
        String s2="";
        int len = s.length();
        for (int i = len-1; i>=0; i--) {
            s2 = s2 + s.charAt(i);
        }
        if (s2.equals(s1)) {
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
        sc.close();
    }

}
