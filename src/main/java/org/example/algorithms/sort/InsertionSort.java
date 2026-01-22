package org.example.algorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static String example() {
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        insertionSort(array);

        return Arrays.toString(array);
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int j = i - 1;

            while (j >= 0 && array[j] > currentValue) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = currentValue;
        }
    }
}