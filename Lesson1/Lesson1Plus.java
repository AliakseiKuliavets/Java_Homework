public class Lesson1Plus {
    public static void main(String[] args) {

        int number = 345;
        int num1 = number % 10;
        int num2 = ((number % 100) - num1) / 10 ;
        int num3 = (number -((num2 * 10) +num1 )) / 100;

        System.out.println(num3 + ", " + num2 + ", " + num1);
    }
}
