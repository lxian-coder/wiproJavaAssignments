package FlowControlStatements;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  10:39 am      wiproJavaAssigments
 */
public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter a number: ");
        String input = sc.next();
        int length = input.length();
        int number = Integer.parseInt(input);
        int reverseNum = 0;
        for(int i=1; i<=length; i++){
           int remain =  number%10;
           number = number/10;
            reverseNum += (int) (remain*Math.pow(10,(length-i)));
        }
        System.out.println(reverseNum);
    }
}
