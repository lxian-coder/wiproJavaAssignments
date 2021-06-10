package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Darcy Xian  10/6/21  1:22 pm      wiproJavaAssigments
 */
public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        boolean oneAndFour = true;
            for(int i =0; i<num.length;i++){
                if (num[i] != 4 && num[i] != 1){
                    oneAndFour = false;
                    break;
                }
            }
        System.out.println(oneAndFour);

        }


}
