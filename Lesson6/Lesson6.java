/*
№1.

        Представим, что у нас есть устройство, в котором две колбы.
        Прибор работает корректно, если температура первой колбы выше 100 градусов,
         а температура второй колбы меньше 100 градусов.
        Вы должны написать метод, который проверяет это устройство.
        Ваша программа должна иметь переменные temperature1 и temperature2.
        В результате метод возвращает true или false.
*/




import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру первой колбы: ");
        int temperature1 = scanner.nextInt();
        System.out.println("Введите температуру второй колбы: ");
        int temperature2 = scanner.nextInt();

        System.out.println("Device working correct: " + comparsionTemp(temperature1, temperature2));

    }
    static boolean comparsionTemp(int temperature1, int temperature2) {
        boolean device;
        if (temperature1 > 100 && temperature2 < 100) {
            device = true;
        } else {
            device = false;
        }
        return device;
    }
}
