package miniProject1;

import miniProject1.model.DA;
import miniProject1.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Darcy Xian  11/6/21  9:07 am      wiproJavaAssigments
 */
public class DateBoostrap {

    public List<Employee> loadEmpData(){
        List<Employee> employees = new ArrayList<>();
        List<DA> daList = loadDA();
        Employee employee1 = new Employee(1001,"Ashish","01/01/2009","e","R&D",20000,8000,3000,daList);
        Employee employee2 = new Employee(1002,"Sushma","23/08/2012","c","PM",30000,12000,9000,daList);
        Employee employee3 = new Employee(1003,"Rahul","12/11/2008","k","Acct",10000,8000,1000,daList);
        Employee employee4 = new Employee(1004,"Chahat","29/01/2013","r","Front Desk",12000,6000,2000,daList);
        Employee employee5 = new Employee(1005,"Ranjan","16/07/2005","m","Engg",50000,20000,20000,daList);
        Employee employee6 = new Employee(1005,"Suman","1/1/2000","e","Manufacturing",2300,9000,4400,daList);
        Employee employee7 = new Employee(1007,"Tanmay","12/06/2006","c","PM",29000,23000,10000,daList);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        return employees;
    }
    private List<DA> loadDA(){
        List<DA> daList = new ArrayList<>();
        DA da1 = new DA("e","Engineer",20000);
        DA da2 = new DA("c","Consultant",32000);
        DA da3 = new DA("k","Clerk",12000);
        DA da4 = new DA("r","Receptionist",15000);
        DA da5 = new DA("m","Manager",40000);
        daList.add(da1);
        daList.add(da2);
        daList.add(da3);
        daList.add(da4);
        daList.add(da5);
        return daList;
    }
}
