package FlowControlStatements;

/**
 * Darcy Xian  8/6/21  12:14 pm      wiproJavaAssigments
 */
public class Assignment8 {
    public static void main(String[] args) {
        char color = args[0].charAt(0);
        char color2 = Character.toUpperCase(color);
        switch (color){
            case 'R':
                System.out.println("RED");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}
