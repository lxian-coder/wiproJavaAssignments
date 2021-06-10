package miniProject1.model;

import java.util.Date;
import java.util.List;

/**
 * Darcy Xian  11/6/21  8:45 am      wiproJavaAssigments
 */

public class Employee {
    private int empNo;
    private String empName;
    private String  joinDate;
    private String designationCode;
    private String department;
    private double basic;
    private double HRA;
    private double IT;
    private List<DA> daList;

    public Employee(int empNo, String empName, String joinDate, String designationCode, String department, double basic, double HRA, double IT, List<DA> daList) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.HRA = HRA;
        this.IT = IT;
        this.daList = daList;
    }

    @Override
    public String toString(){
        DA daFind = null ;
        for (DA da : daList) {
            if(designationCode == da.getDesignationCode()){
                daFind = da;
                break;
            }
        }

        double salary = basic+HRA-IT+(daFind.getDA());
        System.out.println("EmpNo.  EmpName  Department  Designation  Salary");
        System.out.println(empNo+"     "+empName+"     "+department+"       "+ daFind.getDesignation()+"    "+salary);
        return null;

    }


    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getDesignationCode() {
        return designationCode;
    }

    public void setDesignationCode(String designationCode) {
        this.designationCode = designationCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHRA() {
        return HRA;
    }

    public void setHRA(double HRA) {
        this.HRA = HRA;
    }

    public double getIT() {
        return IT;
    }

    public void setIT(double IT) {
        this.IT = IT;
    }

    public List<DA> getDaList() {
        return daList;
    }

    public void setDaList(List<DA> daList) {
        this.daList = daList;
    }
}
