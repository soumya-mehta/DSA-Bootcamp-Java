import java.util.Scanner;
public class RupeeToDollar {
    //q6 Input currency in rupees and output in USD.
    public static void main(String[] args) {
        float num, dnum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees: ");
        num = sc.nextFloat();
        dnum = num * 0.012f;
        System.out.println("Amount in dollars is " + dnum);
        sc.close();
    }
}
