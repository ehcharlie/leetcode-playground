package org.example.algorithms.sort;

public class QuickSort {

    public static void example() {
        int[] array = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};

        quicksort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer -1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}