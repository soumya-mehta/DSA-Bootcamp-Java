import java.util.Scanner;
public class Flowcharts_Practice3 {
    //q3 Take a number as input and print the multiplication table for it.
    public static void main(String[] args) {
        int n, i, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number here");
        n = sc.nextInt();

        System.out.println("The multiplication table is as follows:");
        i = 1;
        while (i < 11) {
            p = n * i;
            i += 1;
            System.out.println(p);
        }
    sc.close();
    }
}
