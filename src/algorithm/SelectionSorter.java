package algorithm;

import java.util.Random;

public class SelectionSorter {
    public static void main(String[] args) {
        int[] arr = new int[10];
        randomNum(arr);
        System.out.println("Unsorted: ");
        print(arr);
        System.out.println();

        selectionSort(arr);

        System.out.println("Sorted: ");
        print(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minId = j;
                }
            }
            if (i != minId) {
                int temp = arr[i];
                arr[i] = arr[minId];
                arr[minId] = temp;
            }
        }
    }

    private static void randomNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            Random random = new Random();
            num[i] = random.nextInt(20);
        }
    }

    private static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "  ");
        }
    }
}
