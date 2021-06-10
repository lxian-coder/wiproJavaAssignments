package inheritance;

/**
 * Darcy Xian  10/6/21  7:41 pm      wiproJavaAssigments
 */
public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Triangle");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Triangle");
    }
}
