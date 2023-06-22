// 1. Дано трехзначное число. Вывести на экран все цифры этого числа
/* Пример: 345
   Вывод в консоль: Число 345 -> 3, 4, 5

   Дальше я сам уже добавил:
   запрашивать ввод ,
   проверять какое число если меньше 100 или больше 999 то не работать с ним
*/


import java.util.Scanner;

public class Lesson1Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 100 до 999");
        int number = sc.nextInt();
        if ( number >=100 && number <= 999) {
            int num1 = number % 10;
            int num2 = ((number % 100) - num1) / 10 ;
            int num3 = (number -((num2 * 10) +num1 )) / 100;

            System.out.println("Число "+number+" -> " + num3 + ", " + num2 + ", " + num1);
        } else {
            System.out.println("Введено число меньше 100 или больше 999");
        }
    }
}
