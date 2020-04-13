package com.practice.ideas;

import java.lang.*;
import java.util.Arrays;

public class WordCompare {

    public static void main(String[] args) {
        String A = "apple";
        String B = "pear";
        String C = "Geeks";
        String D = "Geeks";
        System.out.println((new WordCompare()).solution(A,B));
        System.out.println((new WordCompare()).solution(C,D));

    }

    public int solution(String A, String B) {
        int missingChars = 0;

        int aLength = A.length();
        int bLength = B.length();

        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        int aCheckIndex = 0;
        int bCheckIndex = 0;

        //A = adehrr
        //B = aehtrr

        do {
            if (aChars[aCheckIndex] == bChars[bCheckIndex]) {
                aCheckIndex++;
                bCheckIndex++;
            } else {
                if (aChars[aCheckIndex] < bChars[bCheckIndex]) {
                    missingChars++; // aChars[aCheckIndex] is missing  //missingChars = 3
                    aCheckIndex++;
                } else {
                    missingChars++; // bChars[bCheckIndex] is missing
                    bCheckIndex++;
                }
            }
        } while ((aCheckIndex < aLength) && (bCheckIndex < bLength));

        return missingChars + (aLength - aCheckIndex) + (bLength - bCheckIndex);
    }

}
