import java.util.Scanner;
public class Flowcharts_Practice1 {
    //q1 Input a year and find whether it is a leap year or not
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year here: ");
        year = sc.nextInt();
        if (year%400 ==0) {
            System.out.println("It is a leap year"); }
        else {
            if (year%4==0 && year%100 !=0) {
               System.out.println("It is a leap year"); 
            }
            else {
                System.out.println("It is not a leap year");
            }
        }
        sc.close();

    }
    
}
