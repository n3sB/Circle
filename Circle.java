import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3;
        double diameter, area, circumference;

        System.out.print("Please enter the diameter of the circle: ");
        diameter = scanner.nextDouble();
        scanner.close();

        area = pi * (diameter * diameter);
        circumference = 2 * pi * diameter;

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println(" ");
        System.out.println("Area of the circle: " + area);

    }
}
