package com.aamod;

public class FindInMountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        FindInMountainArray obj = new FindInMountainArray();
        System.out.println(obj.search(arr, target));
    }

    int search(int[] arr, int target) {

        int peak = peakIndexInMountainArray(arr);

        // Search in the ascending part
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // Search in the descending part
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return -1;
    }
}