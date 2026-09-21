import java.util.Scanner;

public class Zadanie2 {
    public static double calculate(double x) {
        return Math.pow(Math.sin(x), 2) - Math.cos(2*x) + Math.tan(x);
    }

    public static void main(String[] args) {
        System.out.print("Введите значение x: ");
        double x = new Scanner(System.in).nextDouble();

        double y = calculate(x);
        System.out.print("y = " + y);
    }
}
