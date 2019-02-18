package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;
import com.zipcodewilmington.assessment1.part2.StringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){

        int inputLength = input.length();
        int l = input.length();
        int l2=l/2;
        if(l%2!=0){
            l2=l2+1;}

        int counter =0;
        for (int i = 0; i <input.length()-1; i++) {
            String newString=input.substring(i,inputLength);
            if(newString.equals(BasicStringUtils.reverse(newString))){
                counter +=1;
            }
        }
        for (int j = 1; j < l2; j++) {
            String nextComp = input.substring(1,inputLength-j);
            if(nextComp.equals(BasicStringUtils.reverse(nextComp))){
                counter +=1;
            }

        }
        System.out.println(counter +inputLength);
        return counter+inputLength;

    }
}
