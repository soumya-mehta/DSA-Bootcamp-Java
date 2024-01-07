import java.util.Scanner;
public class EvenOdd {
    //q1 Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
        sc.close();
    }
}
