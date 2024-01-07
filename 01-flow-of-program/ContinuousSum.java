import java.util.Scanner;
public class ContinuousSum {
    //q5 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public static void main(String[] args) {
        int a, x, b;
        Scanner sc = new Scanner(System.in);
        x = 0;
        b = 0;
        System.out.println("Enter number: ");
        a = sc.nextInt();

        while (a !=x) {
            b += a;
            System.out.println("Enter number: ");
            a = sc.nextInt();
        }

        System.out.println("The sum is " + b);
        sc.close();
    }
}
