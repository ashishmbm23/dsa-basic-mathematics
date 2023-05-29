package com.ashish.dsabasicmathematics;

import com.ashish.dsabasicmathematics.articles.CountOfDigits;
import com.ashish.dsabasicmathematics.articles.IsPalindrome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DsaBasicMathematicsApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext =  SpringApplication.run(DsaBasicMathematicsApplication.class, args);

        findCountOfDigits(applicationContext);
        checkPalindrome(applicationContext);
    }

    private static void findCountOfDigits(ApplicationContext applicationContext) {
        CountOfDigits countOfDigits = (CountOfDigits) applicationContext.getBean("countOfDigits");
        System.out.println("=========Count of digits============");
        System.out.println("from iteration:" + countOfDigits.returnCountFromIteration(4543));
        System.out.println("from recursion:" + countOfDigits.returnCountFromRecursion(4543));
        System.out.println("from Log:" + countOfDigits.returnCountFromLog(4543));
    }

    private static void checkPalindrome( ApplicationContext applicationContext ){
        IsPalindrome isPalindrome = (IsPalindrome) applicationContext.getBean("isPalindrome");
        System.out.println("=========Is Palindrome============");
        System.out.println("whether 12321 is palindrome:" + isPalindrome.isPalindrome(12321));
        System.out.println("whether 12345 is palindrome:" + isPalindrome.isPalindrome(12345));
    }

}
