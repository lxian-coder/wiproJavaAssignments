package inheritance;

import java.math.BigDecimal;

/**
 * Darcy Xian  10/6/21  6:47 pm      wiproJavaAssigments
 */
public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Jordan Peterson","JordanPeterson@gamil.com",'M');
        Book book = new Book("12 Rules for Life", BigDecimal.valueOf(32),author,12);
        book.toString();
    }
}
