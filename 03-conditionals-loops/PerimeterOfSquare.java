import java.util.Scanner;
public class PerimeterOfSquare {
    //q12 Perimeter Of Square
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the square: ");
        int side = sc.nextInt();
        int perimeter = 4*side;
        System.out.println("The perimeter is: " + perimeter);
        sc.close();
    }
}
