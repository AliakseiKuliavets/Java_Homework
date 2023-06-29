/*
№1
Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
Например:
ввод - mama, papa
вывод - mapa

 */


import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        String first, second;
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextLine();
        second = scanner.nextLine();
        if (first.length() % 2 == 0 && second.length() % 2 == 0) {
            System.out.println("it`s ok");

            int firstHaf1 = first.length() / 2;
            String firstHaf2 = first.substring(0,firstHaf1);

            int secondHaf1 = second.length() / 2;
            String secondHaf2 = second.substring(0,secondHaf1);

            System.out.println(firstHaf2 + secondHaf2);
        } else {
            System.out.println("Одно из ввыеденных чисел не имеют четного количества букв");
        }
    }
}
