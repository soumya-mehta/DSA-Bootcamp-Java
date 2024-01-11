import java.util.Scanner;
public class PerimeterOfParallelogram {
    //q10 Perimeter Of Parallelogram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of parallel sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = 2*(a+b);
        System.out.println("The perimeter is: " + perimeter);
        sc.close();
    }
}
