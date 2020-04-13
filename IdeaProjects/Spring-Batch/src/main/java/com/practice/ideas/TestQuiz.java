package com.practice.ideas;

public class TestQuiz {

    public static void main(String[] args) {

        int [] arr = {13,6,3,11,5,20,4,30};    //12
        int checkNum = 12;
        System.out.println(new TestQuiz().checkInt(arr, checkNum));

    }

    public boolean checkInt(int[] arr, int num){

        int nextValue = arr[1];

        for(int i = 0; i < arr.length-1; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                if (arr[i] + arr[j] == num) {

                    return true;
                }
            }
        }
        return false;
    }
}
