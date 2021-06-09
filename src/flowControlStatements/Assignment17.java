package flowControlStatements;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  10:57 am      wiproJavaAssigments
 */
public class Assignment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter a number: ");
        String input = sc.next();
        int length = input.length();
        int inputNumber = Integer.parseInt(input);
        int number = inputNumber;
        int reverseNum = 0;
        for(int i=1; i<=length; i++){
            int remain =  number%10;
            number = number/10;
            reverseNum += (int) (remain*Math.pow(10,(length-i)));
        }
        if(reverseNum == inputNumber){
            System.out.println(inputNumber + " is a palindrome.");
        }else {
            System.out.println(inputNumber + " is not a palindrome.");
        }
    }
}
