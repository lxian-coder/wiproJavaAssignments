package inheritance;

/**
 * Darcy Xian  10/6/21  6:23 pm      wiproJavaAssigments
 */
public class Box {
    double width, depth, height;
    public Box (double width,double depth,double height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    public double volume(){
        return width*depth*height;
    }
}
