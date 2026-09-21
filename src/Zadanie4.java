import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Данная программа рассчитывает ИМТ (индекс массы тела)");

        System.out.println("Введите вес в кг: ");
        int m = new Scanner(System.in).nextInt();

        if (m == 0 | m < 0) {
            System.out.print("Ошибка: вес не может быть меньше или равен нулю! ");
            return;
        }
        System.out.print("Введите рост в метрах: ");
        double h = new Scanner(System.in).nextDouble();

        if (h == 0 | h < 0) {
            System.out.print("Ошибка: рост не может быть меньше или равен нулю! ");
            return;
        }

        double i = Math.round(m / Math.pow(h, 2));

        System.out.print("Ваш ИМТ составляет: " + i);
    }
}
