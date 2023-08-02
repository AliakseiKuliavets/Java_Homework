/*Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
        Если значение null, то параметр не должен попадать в запрос.
        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}


        Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
        Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';

        Generate SQL query: Return all records from cars where the parameters are equal to given ones using StringBuilder.
If the value is null, then the parameter should not be included in the request.
{"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}


Example: {"id", 1, "country", null, "city", "Helsinki", "year", null}
Result: SELECT * FROM users WHERE id = '1' AND city = 'Helsilnki';

        */



package Lesson9.Lesson9_2;

public class Lesson92 {
    public static void main(String[] args) {
        ArraysList arraysList = new ArraysList();
        arraysList.startProgram();
    }
}
