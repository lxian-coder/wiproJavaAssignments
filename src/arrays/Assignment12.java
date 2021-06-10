package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  1:27 pm      wiproJavaAssigments
 */
public class Assignment12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 integer arrays,each of them only has 3 numbers.（multiple numbers must be separated by a single space）: ");
        System.out.println("Please enter the first array: ");
        String input = sc.nextLine();
        int num[] = transArr(input);
        check(num);
        System.out.println("Please enter the second array: ");
        input = sc.nextLine();
        int num2[] = transArr(input);
        check(num2);

        int[] result = new int[2];
        result[0] = num[1];
        result[1] = num2[1];

        System.out.println(result[0]+" "+result[1]);
    }

    public static int[] transArr(String input){
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        return num;
    }

    public static void check(int[] noMore3){
        if (noMore3.length != 3){
            System.out.println("Wrong input! You must enter 3 numbers for each array.");
            return;
        }
    }
}
