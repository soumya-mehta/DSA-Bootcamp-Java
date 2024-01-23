import java.util.Scanner;

public class VolumeOfSphere {
    //q17 Volume Of Sphere
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        int radius = sc.nextInt();
        sc.close();

        float volume = (3.14f * 4 * radius * radius * radius)/4;
        System.out.println("Volume of sphere is: " + volume);
        sc.close();
    }

}
