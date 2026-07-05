package com.aamod;

import static java.util.Arrays.binarySearch;

public class BinarySearchCeilingProblem {
    public static void main(String[] args) {
        //ceiling problem
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,14,16};
        int target = 19;
        int ans = ceilingproblem(arr,target);
        System.out.println(ans);
    }
    static int ceilingproblem(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}

