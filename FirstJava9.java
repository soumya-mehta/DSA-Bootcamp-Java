import java.util.Scanner;
public class FirstJava9 {
    //q9 To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //WHAT IS AN ARMSTRONG NUMBER- sum of all digits each raised to the power of number of digits is equal to the original number
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

            //calulate singular digits, raise them to power and add them
            int temp_num = num;
            while (temp_num > 0) {
                int digit = temp_num % 10;
                sum += Math.pow(digit, digits);
                // for the next digit
                temp_num /=10;
            }

            //now let us compare the sum and the original num to check for armstrong number
            if (sum == original_num) {
                System.out.println(original_num + " is an Armstrong number");
                count ++;
            }
        }
    System.out.println("The list of Armstrong numbers between " + lower + " and " + upper + " is: " + count);    
        
    }
        

}
