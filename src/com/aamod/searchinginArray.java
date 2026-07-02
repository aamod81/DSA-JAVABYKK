package com.aamod;

public class searchinginArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 44, 66, 5, 55, 667, 776, 99, 89};
        int target = 667;
        int search = linearSearch(nums, target);
        System.out.println(search);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }
        return target;
    }
}