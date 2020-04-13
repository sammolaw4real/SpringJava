package com.practice.ideas;

public class NumberOfDigit {

    public static void main(String[] args) {

        int num = 2681111;
        //System.out.println(numOfDigit(num));
        int rtn = ((int) Math.log10(num)) + 1;
        System.out.println(rtn);

    }

    static int countDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    public static int numOfDigit(int num ){

        String str = Integer.toString(num);

        int digitCount = str.length();
        return digitCount;
    }

}
