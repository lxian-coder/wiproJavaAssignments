package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  1:19 pm      wiproJavaAssigments
 */
public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        boolean needOrder = true;
        while (needOrder){
            needOrder = false;
            for(int i =0; i<num.length-1;i++){
                if (num[i]%2!=0 && num[i+1]%2 ==0){
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                    needOrder = true;
                }
            }

        }
        for (int a: num) {
            System.out.print(a + " ");
        }
    }

}


