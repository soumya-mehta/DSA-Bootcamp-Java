import java.util.Scanner;

public class PerimeterOfRhombus {
    //q13 Perimeter Of Rhombus
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the rhombus: ");
        int side = sc.nextInt();
        int perimeter = 4*side;
        System.out.println("The perimeter is: " + perimeter);
        sc.close();
    }
}
