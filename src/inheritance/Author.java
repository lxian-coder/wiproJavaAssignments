package inheritance;

/**
 * Darcy Xian  10/6/21  6:32 pm      wiproJavaAssigments
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    @Override
    public String toString(){
        System.out.println("Author: "+name+"\nEmail: "+email+"\nGender: "+gender);
        return null;
    }
}
