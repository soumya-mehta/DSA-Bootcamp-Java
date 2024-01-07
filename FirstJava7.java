import java.util.Scanner;
public class FirstJava7 {
    //q7 To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a = 0;
        int b = 1;
        System.out.println("Enter number n: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("The fibonacci series till " + n + " terms is: ");
        System.out.print(a + " " + b + " ");
        int i = 3;
        while ( i <= n) {
            int next = a + b;
            System.out.print(next + " ");
            a =b;
            b = next;
            i++;
        }
    }
        
}
