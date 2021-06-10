package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  3:35 pm      wiproJavaAssigments
 */
public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter 4 integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        if (num.length != 4) {
            System.out.println("Please enter 4 integer numbers.");
            return;
        }

        int[][] twoTwoArr = new int[2][2];
        twoTwoArr[0][0] = num[0];
        twoTwoArr[0][1] = num[1];
        twoTwoArr[1][0] = num[2];
        twoTwoArr[1][1] = num[3];
        {
            System.out.print("The given array is : ");
            display(twoTwoArr);
        }
        int temp ;
        temp = twoTwoArr[0][0];
        twoTwoArr[0][0] = twoTwoArr[1][1];
        twoTwoArr[1][1] = temp;
        temp = twoTwoArr[1][0];
        twoTwoArr[1][0] = twoTwoArr[0][1];
        twoTwoArr[0][1] = temp;
        {
            System.out.print("The revrse of the array is:");
            display(twoTwoArr);
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
