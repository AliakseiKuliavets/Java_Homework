/*
№1.

        Создайте массив из 8 случайных целых чисел из интервала [1;50]
        Выведите массив на консоль в строку.
        Замените каждый элемент с нечетным индексом на ноль.
        Снова выведете массив на консоль в отдельной строке.
*/



import java.util.Random;

public class Lesson7 {
    public static void main(String[] args) {
        int[] arrays = new int[8];
        Random random = new Random();
        for (int val = 0; val < arrays.length; val++)
            arrays[val] = random.nextInt(1,50);
        for (int val : arrays) System.out.print(val + " ");
        System.out.println();
        for (int val : arrays) {
            if (val % 2 != 0) {
                val = 0;
            }
        System.out.print(val + " ");
        }
    }
}
