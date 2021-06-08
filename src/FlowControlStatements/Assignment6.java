package FlowControlStatements;

/**
 * Darcy Xian  8/6/21  12:01 pm      wiproJavaAssigments
 */
public class Assignment6 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        double interest = 0;
        if(args[0] == "Male"){
            if( age >= 1 && age <= 58){
                interest = 8.2;
            }else if(age >= 59 && age <= 100){
                interest = 9.2;
            }
        }
        if(args[0] == "Female"){
            if( age >= 1 && age <= 58){
                interest = 8.4;
            }else if(age >= 59 && age <= 100){
                interest = 10.5;
            }
        }
        System.out.println("Interest is : "+ interest+"%");
    }
}
