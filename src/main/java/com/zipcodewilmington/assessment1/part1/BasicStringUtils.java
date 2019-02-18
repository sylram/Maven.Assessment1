package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String withUpper = str.substring(0,1).toUpperCase()+str.substring(1,str.length());
        return withUpper;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = reverse(str);
        String reverseUpper = camelCase(reverse);
        return reverseUpper;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String inverseCas ="";
        char[] strToChar = str.toCharArray();

        for (int i = 0; i <strToChar.length; i++) {
            if(Character.isUpperCase(strToChar[i])){
                inverseCas += Character.toLowerCase(strToChar[i]);
            }else {
                inverseCas += Character.toUpperCase(strToChar[i]);
            }

        }
        return inverseCas;
    }
}
