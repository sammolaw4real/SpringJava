package com.practice.ideas;

import java.math.BigInteger;

public class PrimeNumber {

    public static void main(String[] args) {

        extraLongFactorials(20);

    }
    static void extraLongFactorials(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for(int i = n; i>=1; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);


    }

}
