import java.util.Scanner;

public class Basic15 {
    //q15 Volume Of Prism
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of prism respectively: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        sc.close();

        int volume = base * height;
        System.out.println("Volume of prism is: " + volume);
        sc.close();
    }

}
