package flowControlStatements;

import java.util.ArrayList;
import java.util.List;

/**
 * Darcy Xian  8/6/21  10:51 am      wiproJavaAssigments
 */
public class Assignment1A {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        List<Integer> intList = new ArrayList<>();
        intList.add(a);
        intList.add(b);

        for(int ele : intList){
            String result1 = null;
            if (ele == 0){
                result1 = a + " is Zero";
            }else if(ele < 0){
                result1  = a + " is negative";
            }else if(ele > 0){
                result1 = a + " is Positive";
            }
            System.out.println(result1);
        }
    }

}
