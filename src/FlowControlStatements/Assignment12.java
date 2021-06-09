package FlowControlStatements;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  10:03 am      wiproJavaAssigments
 */
public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter a number: ");
        int a = Integer.parseInt(sc.next());
        boolean  isPrime = true;
        if(a == 0 || a ==1){
            System.out.println(a + " is not a prime number.");
            isPrime = false;
        }else {
            int b = a/2;
            for(int i =2; i<=b; i++){
                if(a%i == 0){
                    System.out.println(a + " is not a prime number");
                    isPrime = false;
                    break;
                }

            }
        }
        if(isPrime){
            System.out.println(a + " is a prime number.");
        }
    }
}
