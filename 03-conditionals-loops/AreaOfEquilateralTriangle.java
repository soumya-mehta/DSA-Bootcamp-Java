import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    //q7 Area Of Equilateral Triangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of equilateral triangle: ");
        int side = sc.nextInt();
        double area = (Math.sqrt(3)/4) * Math.pow(side, 2);
        System.out.println("The area of the triangle is: " + area);
        sc.close();
    }
}
