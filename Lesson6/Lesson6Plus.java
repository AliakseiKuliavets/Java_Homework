/*
№2.

        У вас на банковском счету N долларов.
        Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем
         текущей суммы на счету и меньше текущей суммы.
        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
         чтобы забрать все свои деньги из банка?
        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

        Ввод:  N = 21
        Выход:  7
        
        Объяснение:  N = 21
        Снято 7, осталось = 14
        Снято 7, осталось = 7
        Снято 1, осталось = 6
        Снято 3, осталось = 3
        Снято 1, осталось = 2
        Снято 1, Осталось = 1
        Снято 1, осталось = 0
*/




import java.util.Scanner;

public class Lesson6Plus {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите сумму на счету: ");
            int balance = scanner.nextInt();

            int day = 0;
            while (balance > 0) {
                int witDraw = balanceTwo(balance);
                balance = balance - witDraw;
                day++;
            }
            System.out.println("Вам потребуется " + day + " дней, чтобы забрать все свои деньги со счета.");
        }

        private static int balanceTwo(int balance) {
            int maxWith = 1;
            for (int i = balance / 2; i > 1; i--) {
                if (balance % i == 0) {
                    maxWith = i;
                    break;
                }
            }
            return maxWith;
        }

}
