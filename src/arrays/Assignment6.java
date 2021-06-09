package arrays;

/**
 * Darcy Xian  9/6/21  12:12 pm      wiproJavaAssigments
 */
public class Assignment6 {
    public static void main(String[] args) {
        int arr[] = {12,23,34,12,2,3};
        boolean ordered = true;

        while (ordered){
            ordered = false;
         int temp = arr[0];
         for(int i =0; i<arr.length-1;i++){
             temp = arr[i];
             if(arr[i+1] < temp){
                 int temp2 = arr[i+1];
                  arr[i+1] = temp;
                  arr[i] = temp2;
                  ordered = true;
             }
         }
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
