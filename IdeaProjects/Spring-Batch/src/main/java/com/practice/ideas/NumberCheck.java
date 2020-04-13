package com.practice.ideas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberCheck {

    public static void main(String[] args) {

        int testNum1 = 16891;
        int testNum2 = 16191;
        int testNum3 = 619;
        int testNum4 = 111167;
        System.out.println(new NumberCheck().solution(testNum1));
        System.out.println(new NumberCheck().solution(testNum2));
        System.out.println(new NumberCheck().solution(testNum3));
        System.out.println(new NumberCheck().solution(testNum4));
        System.out.println(new NumberCheck().findStrobogrammatic(3));

    }

    public boolean solution(int num){

        boolean value = true;
        String str = Integer.toString(num);
        StringBuffer buildInt = new StringBuffer(str);
        StringBuffer strReverse = buildInt.reverse();
        String strReverseNew = String.valueOf(strReverse);
        char[] originalChar = str.toCharArray();
        char[] reverseChar = strReverseNew.toCharArray();

        for (int i = 0; i < str.length(); i++){

            if(originalChar[i] == '1' || originalChar[i] == '0'
                    || originalChar[i] == '8') {
                if(originalChar[i] != reverseChar[i]){
                    value = false;
                    break;

                }
            }

            else if (originalChar[i] == '6') {
                if(reverseChar[i] != '9') {
                    value = false;
                    break;
                }
            }

            else if(originalChar[i] == '9'){
                if(reverseChar[i] != '6') {
                    value = false;
                    break;
                }
            }
            else {
                value = false;
                break;
            }

        }

        return value;
    }


    public List<String> findStrobogrammatic(int n) {
        return dfs(n, n);
    }

    public List<String> dfs(int n, int max) {

        List<String> singleDigitList = new ArrayList<>(Arrays.asList("0", "1", "8"));
        char[][] digitPair = {{'0', '0'}, {'1', '1'}, {'8', '8'}, {'6', '9'}, {'9', '6'}};

        if (n <= 0) return new ArrayList<String>(Arrays.asList(""));
        if (n == 1) return singleDigitList;

        List<String> subList = dfs(n - 2, max);
        List<String> list = new ArrayList<>();
        for (String str : subList) {
            if (n != max) list.add("0" + str + "0");
            for (int i = 1; i < digitPair.length; i++) {
                list.add(digitPair[i][0] + str + digitPair[i][1]);
            }
        }
        return list;
    }

}
