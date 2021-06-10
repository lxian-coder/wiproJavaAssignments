package miniProject1;

import miniProject1.model.Employee;

import java.util.List;
import java.util.Scanner;

/**
 * Darcy Xian  11/6/21  9:51 am      wiproJavaAssigments
 */
public class MiniProject1APP {
    public static void main(String[] args) {
        List<Employee> employeeList = new DateBoostrap().loadEmpData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the employee number : ");
        int inputEmpNo = Integer.parseInt(sc.next());
        for (Employee emp: employeeList) {
            if(inputEmpNo == emp.getEmpNo()){
                emp.toString();
                return;
            }
        }
        System.out.println("There is no employee with empid: "+inputEmpNo);





    }
}
