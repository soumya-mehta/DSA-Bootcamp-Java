import java.util.Scanner;
public class AreaOfIsosclesTrianglwe {
    //q4 Area Of Isosceles Triangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter same side of the isoceles triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the third side of the isoceles triangle: ");
        double b = sc.nextDouble();
        double area = (b/4) * Math.sqrt(4*(a*a)-(b*b));
        System.out.println("The area of the isoceles triangle is " + area);
        sc.close();
    }
}
