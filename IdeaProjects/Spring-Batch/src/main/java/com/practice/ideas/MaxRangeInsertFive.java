package com.practice.ideas;

public class MaxRangeInsertFive {

    public static void main(String[] args) {

        System.out.println((new MaxRangeInsertFive()).solution(267));

    }

    public int solution(int N) {
        char digitChar = '5';
        int digit = Character.getNumericValue(digitChar);
        boolean isNegative = false;

        if (N < 0)
            isNegative = true;

        int workingNum = Math.abs(N);
        char[] numChars = ("" + workingNum).toCharArray();
        int workingNumLength = numChars.length;

        int i = 0;
        for (i = 0; i < workingNumLength; i++) {
            int a = Character.getNumericValue(numChars[i]);
            if (!isNegative) {
                if (a < digit) {
                    break; // insert at pos
                }
            } else {
                if (a > digit) {
                    break; // insert at pos
                }
            }
        }

        StringBuffer buf = new StringBuffer().append(numChars, 0, workingNumLength);
        buf.insert(i, digitChar);

        return (Integer.parseInt(buf.toString()) * (isNegative?-1:1));

    }
}
