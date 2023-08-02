package Lesson9.Lesson9_2;

import java.util.Arrays;

public class ArraysList {
    private final String[] myString = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active",
            String.valueOf(true)};
    private String[][] pairArrays;

    private int checkForNull() {
        int count = 0;
        for (int i = 0; i < myString.length; i+=2) {
            String firstElement = myString[i];
            String secondElement = myString[i + 1];
            if (firstElement != null && secondElement != null) {
                count++;
            }
        }
        return count;
    }


    private void makeNewArraysPairs() {
        int nonNullPairs = checkForNull();
        pairArrays = new String[nonNullPairs][2];
        int j = 0;
        for (int i = 0; i < myString.length; i += 2) {
            String firstElement = myString[i];
            String secondElement = myString[i + 1];
            if (firstElement != null && secondElement != null) {
                pairArrays[j][0] = firstElement;
                pairArrays[j][1] = secondElement;
                j++;
            }
        }
    }

    private String makeText() {
        makeNewArraysPairs();
        StringBuilder queryBuilder = new StringBuilder("SELECT * FROM users WHERE ");

        for (int i = 0; i < pairArrays.length; i++) {
            String firstElement = pairArrays[i][0];
            String secondElement = pairArrays[i][1];
            queryBuilder.append(firstElement).append(" = \"").append(secondElement).append("\"");
            if (i < pairArrays.length - 1) {
                queryBuilder.append(" AND ");
            }
        }

        return queryBuilder.toString();
    }
    public void startProgram() {
        System.out.println(makeText());
    }
}
