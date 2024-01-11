import java.util.Scanner;

public class Basic14 {
    //q14 Volume Of Cone Java Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the base of the cone: ");
        int radius = sc.nextInt();
        System.out.println("Enter height of the cone: ");
        int height = sc.nextInt();
        double volume = (1.0/3)*3.14*height*radius*radius;
        System.out.println("The volume is: " + volume);
        sc.close();
    }

}
