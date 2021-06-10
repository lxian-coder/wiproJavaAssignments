package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  12:41 pm      wiproJavaAssigments
 */
public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        int position6 = -1;
        int position7 = -1;
        for(int i =0; i<num.length; i++){
            if (num[i] == 6 && position6 == -1 && position7 == -1 ){
                position6 = i;
            }
            if(num[i] == 7 ){
                position7 = i;
            }
        }
        int sum = 0;
        int shouldDelete = 0;
        if(position7 > position6){
            for(int p = position6; p <= position7; p++){
                shouldDelete += num[p];
            }
        }
        for (int i:num) {
            sum+= i;
        }
        int result = sum - shouldDelete;
        System.out.println(" The sum is :"+ result);

    }
}
