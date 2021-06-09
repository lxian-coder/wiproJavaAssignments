package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  11:34 am      wiproJavaAssigments
 */
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        int max = num[0];
        int min = num[0];
        for(int a =0 ; a < num.length; a++){
            if(min > num[a]) min=num[a];
            if(max < num[a]) max=num[a];
        }
        System.out.println("The maximum is :"+max);
        System.out.println("The minimum is :"+ min);

    }
}

