import java.util.Scanner;

/*Дз No3
        Реализуйте программу, которая попросит пользователя ввести
        три целых числа (используйте сканер) и напечатает максимум из трех чисел.

        Не понял сути задания реализовал как смог
        */

public class Lesson53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Введите первое целое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("максимальное из трех " + max);
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("минимальное из трех " + min);
        int sr = a;
        if ( b < max && b > min) {
            sr = b;
        }
        if ( c < max && c > min) {
            sr = c;
        }

        System.out.println("-----------------");
        System.out.println("Максимум из трех чисел " + max + ""+ sr +"" + min);

    }
}
