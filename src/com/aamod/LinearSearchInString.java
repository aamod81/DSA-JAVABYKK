package com.aamod;

import java.util.Arrays;


//import static com.aamod.searchinginArray.linearSearch;
//
//public class LinearSearchInString {
//    public static void main(String[] args) {
//      //  int[] nums={10,15,50,19,40,44,48,49};
//        //int target=40;
//        //int search = linearSearch(nums, target);
//       // System.out.println(search);
//        String name = "Aamod";
//        char target = 'd';
//      //  System.out.println(search(name,target));
//        System.out.println(Arrays.toString(name.toCharArray()));  ;
//    }
//
//  static boolean search( String str, char target) {
//        if (str.length() == 0){
//        return false;
//    }
//    for(int i=0; i<str.length();i++)
//    {
//          if(target==str.charAt(i)){
//            return true;
//        }
//    } return false;
//
////    static int linearSearch(int[] arr,int target){
////        if(arr.length==0);
////        return-1;
////    }
////    for (int i=0; i<1; i++){
////
////    }
//
//}}
public class LinearSearchInString {

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 44, 66, 5, 55, 667, 776, 99, 89};
        int target = 667;

        System.out.println(linearsearch(nums, target, 0, nums.length - 1));
    }

    static int linearsearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];

            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}