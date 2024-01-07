import java.util.Scanner;
public class ArmstrongNumInRange {
    //q9 To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lower number: ");
        int lower = sc.nextInt();
        System.out.println("Enter your upper number: ");
        int upper = sc.nextInt();
        sc.close();
        int count = 0;

        for (int num= lower; num <= upper; num++) {
            int original_num = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            int temp_num = num;
            while (temp_num > 0) {
                int digit = temp_num % 10;
                sum += Math.pow(digit, digits);
                temp_num /=10;
            }
            if (sum == original_num) {
                System.out.println(original_num + " is an Armstrong number");
                count ++;
            }
        }
    System.out.println("The list of Armstrong numbers between " + lower + " and " + upper + " is: " + count);           
    }        
}
