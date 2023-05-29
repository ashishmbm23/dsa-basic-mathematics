package com.ashish.dsabasicmathematics.articles;

import org.springframework.stereotype.Component;

@Component
public class CountOfDigits {

    public int returnCountFromIteration(int num){
        int result = 0 ;
        while( num > 0 ){
            result++;
            num /= 10;
        }
        return result;
    }

    public int returnCountFromRecursion( int num ){
        if( num <= 0 )
            return 0;
        return 1 + returnCountFromRecursion( num / 10 );
    }

    public int returnCountFromLog(int num){
        return (int) (1 + Math.floor(Math.log10(num)));
    }
}
