package flowControlStatements;

/**
 * Darcy Xian  9/6/21  10:13 am      wiproJavaAssigments
 */
public class Assignment13 {
    public static void main(String[] args) {

        for(int i = 10; i <100; i++){
            boolean  isPrime = true;
                int b = i/2;
                for(int ii =2; ii<=b; ii++){
                    if(i%ii == 0){
                        isPrime = false;
                        break;
                    }
                }
            if(isPrime){
                System.out.println(i + " is a prime number.");
            }
            }
        }


}



