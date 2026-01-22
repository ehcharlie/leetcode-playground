package org.example.algorithms.sort;


/**
 * Selection sort = search through an array and keep track of the minimum value during each iteration
 * At the end of search iteration, we swap variables
 * <p>
 * Quadratic time O(N^2)
 * Small data set = okay-ish
 * Large data set = bad
 */
public class SelectionSort {

    public static void example() {
        int[] array = new int[]{8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    //min is carrying the INDEX - not the value itself
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }


    //Incorrect way to do so, as it swaps multiple times as the low/min is set to a value, not an index
    private static void selectionSort_example_two(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int low = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < low) {
                    low = array[j];
                    array[j] = array[i];
                    array[i] = low;
                }
            }
        }
    }

}