import java.util.Scanner;
public class PerimeterOfRectangle {
    //q11 Perimeter Of Rectangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println("The perimeter is: " + perimeter);
        sc.close();
    }
}
