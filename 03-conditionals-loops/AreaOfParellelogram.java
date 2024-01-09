import java.util.Scanner;
public class AreaOfParellelogram {
    //q5 Area Of Parallelogram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height");
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = base*height;
        System.out.println("The area is "+ area);
        sc.close();
    }
}
