package flowControlStatements;

/**
 * Darcy Xian  8/6/21  12:09 pm      wiproJavaAssigments
 */
public class Assignment7 {
    public static void main(String[] args) {
        char a = args[0].charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println(Character.toLowerCase(a));
        }else {
            System.out.println(Character.toUpperCase(a));
        }
    }
}
