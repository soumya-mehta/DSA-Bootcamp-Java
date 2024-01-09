import java.util.Scanner;
public class AreaOfRhombus {
    //q6 Area Of Rhombus
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st diagonal: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter value of 2nd diagonal");
        double d2 = sc.nextDouble();
        double area = (d1 * d2)/2;
        System.out.println("The area of the rhombus is: " + area);
        sc.close();
    }

}
