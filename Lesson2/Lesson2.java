import java.util.Locale;

public class Lesson2 {
    public static void main(String[] args) {
        String myStr = new String("I study Basic Java!");
        str (myStr);

    }
    static void str(String myStr) {
        System.out.println(myStr);
        System.out.println(myStr.charAt(myStr.length()-2));

        System.out.println(myStr.contains("Java"));

        System.out.println(myStr.substring(14,18));

        String myJava = myStr.substring(14,18);

        String jovo = myJava.replaceAll("a","o");

        System.out.println(jovo);

        System.out.println(jovo.toUpperCase(Locale.ROOT));

        System.out.println(jovo.toLowerCase(Locale.ROOT));
    }
}
