import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    Операции над double/float
                    1. Сравнить
                    2. Округлить
                    3. Отбросить дробную часть
                    """);
            int menu = scanner.nextInt();
            try {
                menu(scanner, menu);
            } catch (InputMismatchException ex) {
                System.out.println("Между цифрами нужно писать |,| а не |.|");
            }
        } while (!scanner.nextLine().equals("end"));
    }

    private static void menu(Scanner scanner, int menu) {
        switch (menu) {
            case 1 -> {
                System.out.println("Введите первое число: ");
                double value1 = scanner.nextDouble();
                System.out.println("Введите второе число: ");
                float value2 = scanner.nextFloat();
                if (Math.abs(value1 - value2) < 0.0001) {
                    System.out.println("Числа: " + value1 + " и " + value2 + " равны");
                } else if (value2 < value1) {
                    System.out.println("Числа: " + value1 + " и " + value2 + " не равны" + "\n" +
                            "Первое число " + value1 + " больше.");
                } else {
                    System.out.println("Числа: " + value1 + " и " + value2 + " не равны" + "\n" +
                            "Второе число " + value2 + " больше.");
                }
            }
            case 2 -> {
                System.out.println("Введите число:");
                double valueRound = scanner.nextDouble();
                int resultRound = (int) Math.round(valueRound);
                System.out.println("Результат:\n" +
                        resultRound);
            }
            case 3 -> {
                System.out.println("Введите число:");
                double valueDro = scanner.nextDouble();
                int resultDro = (int) Math.floor(valueDro);
                System.out.println("Результат:\n" +
                        resultDro);
            }
            default -> System.out.println("Такой операции нет!");
        }
    }
}
