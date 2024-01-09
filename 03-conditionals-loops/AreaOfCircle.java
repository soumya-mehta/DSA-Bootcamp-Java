import java.util.Scanner;
public class AreaOfCircle {
    //q1 Area Of Circle Java Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int r = sc.nextInt();
        float area = 3.14f * (r*r);
        System.out.println("The area of the circle of radius " + r + " is " + area);
        sc.close();
    }

}
