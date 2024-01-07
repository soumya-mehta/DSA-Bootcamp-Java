import java.util.Scanner;
public class LargerNumber {
    //q5 Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter both numbers below: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println("The greater number is " + a);
        }
            // else if and else because conditions are mutually exclusive
        else if (a < b) {
            System.out.println("The greater number is " + b);
        }
        else (a == b) {
            System.out.println("The numbers are equal");
        }
        sc.close();
    }
}
