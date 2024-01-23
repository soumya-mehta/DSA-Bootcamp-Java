import java.util.Scanner;

public class VolumeOfCylinder {
    //q16 Volume Of Cylinder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder respectively: ");
        int radius = sc.nextInt();
        int height = sc.nextInt();
        sc.close();

        float volume = 3.14f * radius * radius * height;
        System.out.println("Volume of cylinder is: " + volume);
        sc.close();
    }

}
