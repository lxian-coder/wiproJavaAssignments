package flowControlStatements;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  10:30 am      wiproJavaAssigments
 */
public class Assignment15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an integer number: ");
        int lineNumber = Integer.parseInt(sc.next());
        for(int i =1; i<=lineNumber; i++){
            System.out.println();
            for(int a =1; a<=i; a++){
                System.out.print("* ");
            }
        }

    }
}
