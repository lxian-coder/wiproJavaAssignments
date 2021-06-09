package flowControlStatements;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  10:18 am      wiproJavaAssigments
 */
public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter a number: ");
        String input = sc.next();
        int a = input.length();
        int number = Integer.parseInt(input);
        int digitSum = 0;
        for(int i = 1; i <= a; i++){
            digitSum += number%10;
            number = number/10;
        }
        System.out.println(digitSum);
    }

}
