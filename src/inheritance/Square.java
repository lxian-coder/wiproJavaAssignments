package inheritance;

/**
 * Darcy Xian  10/6/21  7:41 pm      wiproJavaAssigments
 */
public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Square");
    }
}
