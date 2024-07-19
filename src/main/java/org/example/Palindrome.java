package org.example;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        String test = "ABBA";

        Boolean validPalindrom = validPalindrom(test);
        if(validPalindrom){
            System.out.println("  valid palindrom "+test);

        }
    }

    private static Boolean validPalindrom(String test) {

        int left = 0;
        int right = test.length() -1;

        while (left < right){
            if(test.charAt(left) != test.charAt(right)){
                System.out.println("Not valid palindrom "+test);
                return false;
            }

            left+=1;
            right-=1;

        }
        return true;
    }

}
