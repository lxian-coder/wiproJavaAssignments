package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  11:05 am      wiproJavaAssigments
 */
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
          num[i] = Integer.parseInt(arr[i]);
        }

        int avg = 0;
        int sum = 0;
        for(int a =0 ; a < num.length; a++){
            sum += num[a];
        }
        avg = sum/num.length;
        System.out.println("The average is :"+avg);
        System.out.println("The sum is :"+ sum);

    }


}
