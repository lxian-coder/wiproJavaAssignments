package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  4:00 pm      wiproJavaAssigments
 */
public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter 9 integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        if (num.length != 9) {
            System.out.println("Please enter 9 integer numbers.");
            return;
        }
        int[][] givenArr = new int[3][3];
        int index = 0;
        for(int i =0;i < 3; i++){
            for(int b =0 ; b<3; b++){
                givenArr[i][b] = num[index];
                index++;
            }
        }
        {
            System.out.println("The given array is :");
            display(givenArr);
        }

        int max= givenArr[0][0];
        for(int i =0;i < 3; i++){
            for(int b =0 ; b<3; b++){
                if(max < givenArr[i][b]){
                 max = givenArr[i][b];
                }
            }
        }
        {
            System.out.println();
            System.out.println("The biggest number in the given array is "+max);
        }

    }
    public static void display(int[][] twoTwoArr){
        for (int[] a : twoTwoArr) {
            System.out.println();
            for (int b : a) {
                System.out.print(b+" ");
            }
        }
    }
}
