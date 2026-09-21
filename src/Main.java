import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String y = "гитара";
        int array = 6834;
        String staticSea = "Море";
        String c = "Цветок";
        String y2 = "шахматы";
        double byteV = 2772.3749726591189214;
        String text = "велосипед";
        long voidV = 'b';
        String d = "Компьютер";
        double y3 = 4047.6937071833308311;
        String num = "1571";
        int value = 'I';
        double num2 = 3492.9436366245830913;
        String str = "c";
        int voidV2 = 8956;

        //Zadanie2();

        //Zadanie3();
        Zadanie4();
    }
    public static void Zadanie2(){
        System.out.print("Введите значение x: ");
        double x = new Scanner(System.in).nextDouble();

        double y = Math.pow(Math.sin(x), 2) - Math.cos(2*x) + Math.tan(x);
        System.out.print("y = " + y);

    }

    public static void Zadanie3(){
        System.out.print("Введите значение a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Введите значение b: ");
        int b = new Scanner(System.in).nextInt();

        if (a>b) {
            System.out.print(a);

        } else if (b>a) {
            System.out.print(b);
        }
    }

    public static void Zadanie4(){
        System.out.println("Данная программа рассчитывает ИМТ (индекс массы тела)");

        System.out.println("Введите вес в кг: ");
        int m = new Scanner(System.in).nextInt();

        if (m==0 | m < 0){
            System.out.print("Ошибка: вес не может быть меньше или равен нулю! ");
            return;
        }
        System.out.print("Введите рост в метрах: ");
        double h = new Scanner(System.in).nextDouble();

        if (h == 0 | h < 0){
            System.out.print("Ошибка: рост не может быть меньше или равен нулю! ");
            return;
        }

        double i = Math.round(m/Math.pow(h, 2));

        System.out.print("Ваш ИМТ составляет: " + i);

    }

}

