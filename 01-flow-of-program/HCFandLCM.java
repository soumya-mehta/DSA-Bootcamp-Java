import java.util.Scanner;
public class HCFandLCM {
    //q4 Take 2 numbers as inputs and find their HCF and LCM.
    public static void main(String[] args) {
        int a, b, r, num, den, hcf, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter greater number");
        a = sc.nextInt();
        System.out.println("Enter smaller number");
        b = sc.nextInt();
        num = a;
        den = b;
        while (den != 0) {
            r = den;
            den = num%den;
            num = r;
        }
        hcf = num;
        lcm = (a*b)/hcf;
        System.out.println("Your HCF is " + hcf + " and your LCM is " + lcm);
        sc.close();
    }
}
