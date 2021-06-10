package inheritance;

/**
 * Darcy Xian  10/6/21  7:06 pm      wiproJavaAssigments
 */

public class Employee extends Person{
      private double salary;
      private int yearStartToWork;
      private String insuranceNum;

    public Employee(String name,double salary, int yearStartToWork, String insuranceNum) {
        super(name);
        this.salary = salary;
        this.yearStartToWork = yearStartToWork;
        this.insuranceNum = insuranceNum;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearStartToWork() {
        return yearStartToWork;
    }

    public void setYearStartToWork(int yearStartToWork) {
        this.yearStartToWork = yearStartToWork;
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }
}
