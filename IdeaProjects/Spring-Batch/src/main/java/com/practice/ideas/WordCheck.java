package com.practice.ideas;

public class WordCheck {

    public static void main (String[] args) {

        String s1 = "ABC";
        String s2 = "rice";
        String s3 = "9087";
        String s4 = "@@#$";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));

    }

    public static String solution(String s) {
        char c = s.charAt(0);
        if ((c >= 'A') && (c <= 'Z')) {
            return "upper";
        } else if ((c >= 'a') && (c <= 'z')) {
            return "lower";
        } else if ((c >= '0') && (c <= '9')) {
            return "digit";
        } else {
            return "other";
        }
    }


}
