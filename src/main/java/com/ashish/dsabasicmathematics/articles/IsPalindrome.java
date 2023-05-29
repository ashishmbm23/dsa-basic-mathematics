package com.ashish.dsabasicmathematics.articles;

import org.springframework.stereotype.Component;

@Component
public class IsPalindrome {

    public boolean isPalindrome(int num){
        int revNum = 0 ;
        int temp = num;
        while( temp > 0 ){
            int lastDigit = temp %10;
            revNum = revNum * 10 + lastDigit;
            temp /= 10;
        }
        if( revNum == num ){
            return true;
        }else{
            return false;
        }
    }
}
