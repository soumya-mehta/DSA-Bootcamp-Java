import java.util.Scanner;
public class FirstJava7 {
    //q7 To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initialize all the variables- n is input, i is for initializing for loop, a and b for calculating fibonacci terms
        int n, i;
        int a = 0;
        int b = 1;
        System.out.println("Enter number n: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("The fibonacci series till " + n + " terms is: ");
        // for (i = 1; i <= n; i++) {
        //     System.out.println(a + " ");
        //     //the result of terms a and b is stored in c, which is used for calculating the next term
        //     int c = a+b;
        //     a=b;
        //     b=c;
        //more optimized and concised code- PRINT VALUES OF FIRST 2 FIBONACCI TERMS OUTSIDE THE LOOP 
        System.out.print(a + " " + b + " ");

        for (i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");

            // Update prev and current for the next iteration
            a = b;
            b = next;
        }
        
    }
}
