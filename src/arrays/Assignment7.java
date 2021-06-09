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
        for(int i =0; i<num.length; i++){
            int temp = num[i];
            for(int a =0; a<num.length;a++){
                if(a != i){
                    if(temp == num[a]){
                        dupli.add(i);
                    }
                }
            }
        }
        int modifyLength = dupli.size();
        int num2[] = new int[num.length-modifyLength];
        int index =0;
        for(int i = 0;i<num.length; i++) {
            boolean delete = false;
            for(int d =0; d<dupli.size();d++){
                if(i == dupli.get(d));
                delete = true;
            }
            if(!delete){
                num2[index] = num[i];
                index++;
            }
        }
      for (int i =0; i<num2.length;i++){
          System.out.println(num2[i]);
      }

    }
}
