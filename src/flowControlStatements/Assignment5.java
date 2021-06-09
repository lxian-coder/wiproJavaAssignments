package flowControlStatements;

import java.util.regex.Pattern;

/**
 * Darcy Xian  8/6/21  11:48 am      wiproJavaAssigments
 */
public class Assignment5 {
    public static void main(String[] args) {
        if(args[0].matches("[a-zA-Z]")){
            System.out.println("Alphabhet");
        }else if(Pattern.compile("[0-9]*").matcher(args[0]).matches()){
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }
    }
}
