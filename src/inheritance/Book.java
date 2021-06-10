package inheritance;

import java.math.BigDecimal;

/**
 * Darcy Xian  10/6/21  6:36 pm      wiproJavaAssigments
 */
public class Book {
    private String name;
    private BigDecimal price;
    private Author author;
    private int qtyInStock;
    public Book(String name, BigDecimal price,Author author, int qtyInStock){
        this.author = author;
        this.price = price;
        this.name = name;
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString(){
        System.out.println("Book: "+name+"\nPrice: "+price+"\nqtyInStock: "+qtyInStock);
        author.toString();
        return null;
    }
}
