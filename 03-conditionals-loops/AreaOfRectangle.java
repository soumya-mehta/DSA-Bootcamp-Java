import java.util.Scanner;
public class AreaOfRectangle {
    //q3 Area Of Rectangle Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle respectively: ");
        int len = sc.nextInt();
        int base = sc.nextInt();
        sc.close();
        int area = len * base;
        System.out.println("Area of rectangle is " + area);
    }
}
