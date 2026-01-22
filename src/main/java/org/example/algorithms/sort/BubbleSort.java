package org.example.algorithms.sort;


//Bubble sort = pairs of adjacent elements are compared, and the elements are
//      swapped if they are not in order
//
//     Quadratic time O(N^2)
//     Small data set = okay-ish
//     Large data set = bad
//
//TLDR: Compares pairs of adjacent elements
public class BubbleSort {

    public static void example() {
        int[] array = new int[]{9, 8, 4, 7, 8, 6, 5, 4, 3, 2, 1, 8, 7, 3, 4, 5, 67, 11};

        bubbleSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] array) {

        //The formila is array.length - i - 1 because the largest value is put at the last index
        //on the first pass
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}