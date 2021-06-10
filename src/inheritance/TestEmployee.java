package inheritance;

/**
 * Darcy Xian  10/6/21  7:25 pm      wiproJavaAssigments
 */
public class TestEmployee {
    public static void main(String[] args) {
      Employee employee = new Employee("Darcy Xian",3333,2021,"1212121");
        employee.setSalary(2222);
        System.out.println("Name: "+ employee.getName());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("YearToStart: "+employee.getYearStartToWork());
        System.out.println("Insurance number: "+employee.getInsuranceNum());

    }
}
