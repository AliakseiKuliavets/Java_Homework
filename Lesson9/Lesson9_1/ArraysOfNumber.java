package Lesson9.Lesson9_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfNumber {
    private  int[] arr;

    public void StartProgram() {
        getMakeArrays();
        System.out.println("Lost number: " + getFindLostNumber());
    }
    private void makeArrays() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int lenght = scanner.nextInt();
        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.print(i + " index in Arrays: ");
            arr[i] = scanner.nextInt();
        }
        this.arr = arr;
    }
    public void getMakeArrays() {
         makeArrays();
    }
    private int findLostNumber() {
        Arrays.sort(arr);
        int i;
        for ( i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]-1) {
                return arr[i]+1;
            }
        }
        return i;
    }
    public int getFindLostNumber() {
        return findLostNumber();
    }


}
