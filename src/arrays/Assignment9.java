package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  1:05 pm      wiproJavaAssigments
 */
public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        for (int i =0; i<num.length; i++){
            if(num[i] == 10){
                num[i] = 0;
            }
        }

        boolean needOrder = true;
        while (needOrder){
            needOrder = false;
            for(int i =0; i<num.length-1;i++){
                if (num[i] == 0 && num[i+1] !=0){
                    num[i] = num[i+1];
                    num[i+1] = 0;
                    needOrder = true;
                }
            }

        }
        for (int a: num) {
            System.out.print(a + " ");
        }
    }
}
