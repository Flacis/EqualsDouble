import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Операции над double/float\n" +
                    "1. Сравнить\n" +
                    "2. Округлить\n" +
                    "3. Отбросить дробную часть\n");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    try {
                        double value = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Nope");
                    }
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
                    break;
                case 2:
                    System.out.println("Введите число:");
                    double valueRound = scanner.nextDouble();
                    int resultRound = (int) Math.round(valueRound);
                    System.out.println("Результат:\n" +
                            resultRound);
                    break;
                case 3:
                    System.out.println("Введите число:");
                    double valueDro = scanner.nextDouble();
                    int resultDro = (int) Math.floor(valueDro);
                    System.out.println("Результат:\n" +
                            resultDro);
                    break;
                default:
                    System.out.println("Такой операции нет!");

            }
            if (scanner.nextLine().equals("end")) {
                break;
            }
        }
    }
}
