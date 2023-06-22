// 1. В методе main инициализировать все примитивные типы и не примитивные типы.
// 2. Вывести их результат в консоль:
/*char: G
        int: 89
        byte: 4
        short: 56
        float: 4.7333436
        double: 4.355453532
        long: 12121

        Character: G
        Integer: 89
        Byte: 4
        Short: 56
        Float: 4.7333436
        Double: 4.355453532
        Long: 12121
*/


public class Lesson1 {
    public static void main(String[] args) {

        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436f;
        double myDouble = 4.355453532;
        long myLong = 12121;

        boolean myBool = true;
        String myString = "String";
        String[] array = {"first", "second"};


        System.out.println("char: "+myChar);
        System.out.println("int: "+myInt);
        System.out.println("byte: "+myByte);
        System.out.println("short: "+myShort);
        System.out.println("float: "+myFloat);
        System.out.println("double: "+myDouble);
        System.out.println("long: "+myLong);

        System.out.println();

        System.out.println("Character: "+myChar);
        System.out.println("Integer: "+myInt);
        System.out.println("Byte: "+myByte);
        System.out.println("Short: "+myShort);
        System.out.println("Float: "+myFloat);
        System.out.println("Double: "+myDouble);
        System.out.println("Long: "+myLong);
    }
}
