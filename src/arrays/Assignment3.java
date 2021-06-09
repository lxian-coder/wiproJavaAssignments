package arrays;

import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  11:38 am      wiproJavaAssigments
 */
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter a number you want to search: ");
        int input =Integer.parseInt( sc.next());
        boolean findNum = false;
        int array[] = {1,4,34,56,7};
        for(int i =0; i<array.length;i++){
            if(array[i] == input){
                System.out.println("The index value is: "+ (i+1));
                findNum = true;
                break;
            }
        }
        if(findNum=false){
            System.out.println("-1");
        }

    }
}
