package com.practice.ideas;

import java.util.*;

public class LargestRange {

    public static void main(String[] args) {


        int [] arrNum = {12,7,11,6,8,15,10,20,14,1};
        System.out.println("Largest Range: " + (new LargestRange().largestRange(arrNum)));

    }

    public int largestRange(int[] arr){

        //int lastElementInArray = arr[arr.length-1];
        //int missingArrayValue = 0;
        int longest = 0;
        List<Integer> longestRange = new ArrayList<Integer>();
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int tempValue = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tempValue;
                i = -1;
            }
        }

        System.out.println("Sorted Array" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int end = arr[i];
            int begin = arr[i];
            if(integerMap.containsKey(arr[i]+1))
                end = arr[i] + integerMap.get(arr[i]+1);
            if(integerMap.containsKey(arr[i]-1))
                begin = arr[i] - integerMap.get(arr[i]-1);
            longest = Math.max(longest, end-begin+1);
            integerMap.put(end, end-begin+1);
            integerMap.put(begin, end-begin+1);
        }
        return longest;
    }

}
