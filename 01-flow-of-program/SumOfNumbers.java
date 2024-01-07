import java.util.Scanner;

public class SumOfNumbers {
    //q2 Take two numbers and print the sum of both.
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        a = sc.nextInt();
        System.out.println("Enter your 2nd number");
        b = sc.nextInt();
        c = a + b;
        System.out.print("Your sum is " + c);
        sc.close();
    }
}
