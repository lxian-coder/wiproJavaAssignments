package flowControlStatements;

/**
 * Darcy Xian  8/6/21  11:25 am      wiproJavaAssigments
 */
public class Assignment3 {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("No Values");
        }else {
            for(int i =0; i< args.length; i++){
                System.out.print(args[i] + " , ");
            }
        }
    }
}
