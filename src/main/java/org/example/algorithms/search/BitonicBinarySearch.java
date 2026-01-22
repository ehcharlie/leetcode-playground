package org.example.algorithms.search;

//Bitonic binary search is used to find the 'Peak' index

//Consider a scenario where you're dealing with a dataset
//akin to a roller coaster ride — you start with a steady
//climb (ascending values), reach the summit (the peak value),
//and then take a thrilling dive (descending values).
//This is precisely what a bitonic array resembles.
//For instance, if you track the hourly temperature readings
//over a day, the temperature may increase until noon and
//then decrease towards the evening, forming a
//bitonic pattern.
public class BitonicBinarySearch {

    public static int findPosition(int arr[], int x) {
        //Finds the peak value I.E The highest value
        int peakIndex = findPeak(arr);

        int searchResult = binarySearch(arr, x, 0, peakIndex, true);
        //search to the left of the peak
        if (searchResult != -1) {
            return searchResult;
        } else {
            //search to the right of the peak
            return binarySearch(arr, x, peakIndex + 1, arr.length - 1, false);
        }
    }

    static int findPeak(int arr[]) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        //This is the index of the highest value
        return low;
    }

    static int binarySearch(int arr[], int x, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (ascending) {
                if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[mid] > x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}