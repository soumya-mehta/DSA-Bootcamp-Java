import java.util.Scanner;
public class PerimeterOfCircle {
    //q8 Perimeter Of Circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int radius = sc.nextInt();
        double perimeter = 2*3.14*radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
        sc.close();
    }
}
