import java.util.Scanner;
public class AreaOfTriangle {
    //q2 Area Of Triangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of triangle respectively: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        sc.close();

        float area = 0.5f * base * height;
        System.out.println("Area of triangle is: " + area);
        
    }
}
