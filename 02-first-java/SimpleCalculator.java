import java.util.Scanner;
public class SimpleCalculator {
    //q4 Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, r=0;
        char op;
        System.out.println("Enter your numbers below: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your operator from the following- (+, -, *, /)");
        op = sc.next().charAt(0);
        if (op == '+') {
            r = a+b;
        }
        if (op == '-') {
            r = a-b;
        }
        if (op == '*') {
            r = a*b;
        }
        if (op == '/') {
            r = a/b;
        }
        System.out.println("the output for your operation is: " + r);
        sc.close();
    }
}
