package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  11:49 am      wiproJavaAssigments
 */
public class Assignment5 {
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

        int c =0;
        int num2[] = new int[num.length-2];
        for(int i = 0;i<num.length; i++) {
            if (num[i] != max && num[i] != min) {
                num2[c] = num[i];
                c++;
            }
        }
          int max2 = num2[0];
          int min2 = num2[0];
        for(int a =0 ; a < num2.length; a++){
            if(min2 > num2[a]) min2=num2[a];
            if(max2 < num2[a]) max2=num2[a];
        }
        System.out.println("The largest 2 numbers are :"+max+" "+max2);
        System.out.println("The smallest 2 numbers are :"+ min+ " "+ min2);
    }
    }

