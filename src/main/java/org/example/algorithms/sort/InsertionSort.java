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
            int currentValue = array[i]; //Current value is index n+1
            int previousValue = i - 1; //Index before I - always assumed to eb 'sorted' ish

            while (previousValue >= 0 && array[previousValue] > currentValue) {
                array[previousValue + 1] = array[previousValue];
                previousValue--;
            }
            array[previousValue + 1] = currentValue;

        }
    }
}