package com.practice.ideas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSorting {

    public static void main(String [] arg){

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(0);
        integerList.add(1);
        integerList.add(0);


        int arr1[] = {1,6,3,2,5};
        int arr2[] = {1,2,3,4};
        int arr3[] = {3,0,2,4};

        //System.out.println(minMax(integerList));
        System.out.println("Sorted Array: " + (solution(arr1)));
        System.out.println("Sorted Array: " + (solution(arr2)));
        System.out.println("Sorted Array: " + (solution(arr3)));

    }

    public static int minMax(List<Integer> binary){

        int firstArray = binary.get(1);

        for(int i = 0; i < binary.size(); i++){

            if(binary.get(i) == firstArray){
                firstArray = binary.get(i);
            }

            else if(binary.get(i) != firstArray){

            }
            firstArray++;
        }

        return firstArray;
    }

    public static int solution(int[] arrayValues) {
        // write your code in Java SE 8

        int lastElementInArray = arrayValues[arrayValues.length-1];
        int missingArrayValue = 0;
        for (int i = 0; i < arrayValues.length-1; i++) {
            if(arrayValues[i] > arrayValues[i +1] ){
                int tempValue = arrayValues[i];
                arrayValues[i] = arrayValues[i + 1];
                arrayValues[i + 1] = tempValue;
                i = -1;
            }
        }

        for(int i = 0; i < arrayValues.length - 1; i++){
            if ((arrayValues[i] + 1 != arrayValues[i + 1]) || (arrayValues[i]  == lastElementInArray)){
                missingArrayValue = arrayValues[i] + 1;
                break;
            }

        }

        return missingArrayValue;
    }
}
