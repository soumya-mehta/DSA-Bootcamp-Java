import java.util.Scanner;
public class Simple_Interest {
    //q3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, t, r;
        System.out.println("Enter your input principal here: ");
        p = sc.nextInt();
        System.out.println("Enter the time: ");
        t = sc.nextInt();
        System.out.println("Enter rate of interest here: ");
        r = sc.nextInt();
        int i = (p*t*r)/100;
        System.out.println("Simple interest comes as " + i);
        sc.close();
    }
}
