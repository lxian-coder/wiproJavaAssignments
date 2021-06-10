package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Darcy Xian  9/6/21  12:22 pm      wiproJavaAssigments
 */
public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter an array of integer numbers（multiple numbers must be separated by a single space）: ");
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int num[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        List<Integer> dupli = new ArrayList<>();
        for(int i =0; i<num.length-1; i++){
            int temp = num[i];
            for(int a = i+1; a<num.length;a++){
                boolean recorded = false;
                for ( int b : dupli) {
                    if(a == b) recorded = true;
                }
                if(a != i && recorded == false){
                    if(temp == num[a]){
                        dupli.add(a);
                    }
                }
            }
        }

        int modifyLength = dupli.size();
        int num2[] = new int[num.length-modifyLength];
        int index =0;
        for(int i = 0;i<num.length; i++) {
            boolean shouldDelete = false;
            for(int b : dupli) {
                if(i == b) shouldDelete = true;
            }
            if(shouldDelete == false){
                num2[index] = num[i];
                index++;
            }
        }
      for (int i =0; i<num2.length;i++){
          System.out.print(num2[i]+" ");
      }

   }
}
