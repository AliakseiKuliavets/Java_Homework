/*
№2.

        Создайте массив из 5 случайных целых чисел из интервала [10;99]
        Выведите его на консоль в строку.
        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
*/




import java.util.Random;

public class Lesson72 {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        Random random = new Random();
        for (int val = 0; val < arrays.length; val++)
            arrays[val] = random.nextInt(90)+10;

        // для проверки (часто он не является возрастающей и можно вручную загнать значения)
//        arrays[0] = 2;
//        arrays[1] = 3;
//        arrays[2] = 4;
//        arrays[3] = 5;
//        arrays[4] = 6;

        noSort(arrays);
        System.out.println();
        System.out.println((sortOrNo(arrays) == true ? "Массив является строго возрастающей последовательностью. " : "")
                + (sortOrNo(arrays) == false  ? "Массив не является строго возрастающей последовательностью." : ""));
    }
    static boolean sortOrNo(int[] arrays) {
        boolean sort = true;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] >= arrays[i + 1]) {
                sort = false;
                return sort;
            }
        }
                return sort;

    }
    static void noSort(int[] arrays) {
        for (int val : arrays) System.out.print(val + " ");
    }
}
