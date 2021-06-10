package inheritance;

/**
 * Darcy Xian  10/6/21  7:38 pm      wiproJavaAssigments
 */
public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Circle");
    }

}
