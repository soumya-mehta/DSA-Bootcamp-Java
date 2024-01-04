import java.util.Scanner;
public class FirstJava2 {
    //q2 Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Welcome to Java!");
        sc.close();
    }
}
