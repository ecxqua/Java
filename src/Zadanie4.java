import java.util.Scanner;

public class Zadanie4 {

    public static double calculate(double m, double h) {
        return Math.round(m / Math.pow(h, 2));
    }

    public static void printMenu() {
        System.out.println("Главное меню:");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    public static void showProgramInfo() {
        System.out.println("\n--- Информация о программе ---");
        System.out.println("Данная программа рассчитывает ИМТ (индекс массы тела).");
        System.out.println("Формула расчёта: ИМТ = вес (кг) / (рост (м))^2");
    }

    public static void showDeveloperInfo() {
        System.out.println("\n--- Информация о разработчике ---");
        System.out.println("Разработчица: Давлетшина Юлия");
    }

    public static Double readPositiveDouble(Scanner scanner, String prompt, String errorNonPositive) {
        System.out.print(prompt);
        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("выход") || input.equalsIgnoreCase("exit")) {
                return null;
            }

            try {
                double value = Double.parseDouble(input.replace(',', '.'));
                if (value <= 0) {
                    System.out.println(errorNonPositive);
                    System.out.print("Повторите ввод или введите команду выхода ('выход'): ");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный ввод, ожидается число!");
                System.out.print("Повторите ввод или введите команду выхода ('выход'): ");
            }
        }
    }

    public static void performCalculation(Scanner scanner) {
        System.out.println("\n--- Выполнение расчёта ---");

        Double m = readPositiveDouble(scanner, "Введите вес в кг: ", "Ошибка: вес не может быть меньше или равен нулю!");
        if (m == null) {
            System.out.println("Расчёт отменён. Возврат в главное меню.");
            return;
        }

        Double h = readPositiveDouble(scanner, "Введите рост в метрах: ", "Ошибка: рост не может быть меньше или равен нулю!");
        if (h == null) {
            System.out.println("Расчёт отменён. Возврат в главное меню.");
            return;
        }

        double i = calculate(m, h);
        System.out.println("Ваш ИМТ составляет: " + i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Данная программа рассчитывает ИМТ (индекс массы тела)\n");

        while (isRunning) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    performCalculation(scanner);
                    break;
                case "2":
                    showProgramInfo();
                    break;
                case "3":
                    showDeveloperInfo();
                    break;
                case "4":
                case "выход":
                case "exit":
                    System.out.println("Выход из программы. До свидания!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Ошибка: неверный пункт меню! Повторите ввод или выберите 4 для выхода.");
                    break;
            }
            System.out.println();
        }
    }
}
