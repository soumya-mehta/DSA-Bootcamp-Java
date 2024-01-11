import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    //q9 Perimeter Of Equilateral Triangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of triangle: ");
        int side = sc.nextInt();
        int perimeter = 3*side;
        System.out.println("The perimeter of the triangle is: " + perimeter);
        sc.close();
    }
}
