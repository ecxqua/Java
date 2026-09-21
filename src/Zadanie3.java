import java.util.Scanner;

public class Zadanie3 {
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите значение a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Введите значение b: ");
        int b = new Scanner(System.in).nextInt();

        if (a > b) {
            System.out.print(a);
        } else if (b > a) {
            System.out.print(b);
        }
    }
}
