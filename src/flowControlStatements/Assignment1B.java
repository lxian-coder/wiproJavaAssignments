package flowControlStatements;

/**
 * Darcy Xian  8/6/21  11:13 am      wiproJavaAssigments
 */
public class Assignment1B {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int aLast = a % 10;
        int bLast = b % 10;
        if (aLast == bLast){
            System.out.println("True");;
        }else {
            System.out.println("False");
        }
    }
}



