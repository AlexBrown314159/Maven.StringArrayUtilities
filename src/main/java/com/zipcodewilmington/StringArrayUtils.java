package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO


    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        Integer length = array.length;

        return array[length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        Integer length = array.length;


        return array[length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean myAns = false;

        for (Integer i = 0; i < array.length; i++) {
            if (array[i] == value) {
                myAns = true;
            }
        }

        return myAns;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] myStr = new String[array.length];

        for (Integer i = 0; i < array.length; i++) {

            myStr[array.length-i-1] = array[i];

        }

        return myStr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Boolean myAns = true;

        Integer len = array.length;

        for (Integer i = 0; i < len; i++) {

            if (array[i] != array[len-i-1]) {
                myAns = false;
            }

        }

        return myAns;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Boolean myAns = true;
        Boolean letTest = false;
        Integer totLet = 0;
        String abc = "abcdefghijklmnopqrstuvwxyz";

        for (Integer i = 0; i < array.length; i++) {
            totLet = totLet + array[i].length();
        }
        if (totLet < 26) {
            return false;
        }

        for (Integer j = 0; j < abc.length(); j++) {
            letTest = false;

            for (Integer i = 0; i < array.length; i++) {

                for (Integer k = 0; k < array[i].length(); k++) {
                    if ((abc.charAt(j)) == (array[i].charAt(k))) {
                        letTest = true;
                    }
                }
            }
            if (letTest = false) {
                myAns = false;
                return myAns;
            }
        }
        return myAns;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numTimes = 0;

        for (Integer i = 0; i < array.length; i++) {

            if (value == array[i]) {
                numTimes++;
            }

        }

        return numTimes;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arr = new ArrayList<String>();

        for (Integer i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                arr.add(array[i]);
            }

        }

        String[] myStr2 = new String[arr.size()];

        for (Integer i = 0; i < myStr2.length; i++) {
            myStr2[i] = arr.get(i);
        }

        return myStr2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String testStr = "";

        ArrayList<String> arr = new ArrayList<String>();

        for (Integer i = 0; i < array.length; i++) {

            if (testStr.equals(array[i])) {
            }
            else {
                arr.add(array[i]);
                testStr = array[i];
            }
        }

        String[] myStr2 = new String[arr.size()];

        for (Integer i = 0; i < myStr2.length; i++) {
            myStr2[i] = arr.get(i);
        }

        return myStr2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated
     * as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        Integer iCount = 1;

        String str = array[0];

        for (Integer i = 1; i < array.length; i++) {

           if (array[i] != str) {

               str = array[i];
               iCount++;

           }
        }

        String[] outPut = new String[iCount];

        iCount = 0;

        str = array[0];
        outPut[0] = str;

        for (Integer i = 1; i < array.length; i++) {

            if (array[i] != str) {

                str = array[i];
                iCount++;
                outPut[iCount] = array[i];

            }
            else {

                outPut[iCount] = outPut[iCount] + array[i];

            }

        }

        return outPut;
    }

}
