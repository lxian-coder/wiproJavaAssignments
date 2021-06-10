package miniProject1.model;

/**
 * Darcy Xian  11/6/21  8:45 am      wiproJavaAssigments
 */
public class DA{
    private String designationCode;
    private String Designation;
    private double DA;

    public DA(String designationCode, String designation, double DA) {
        this.designationCode = designationCode;
        Designation = designation;
        this.DA = DA;
    }

    public String getDesignationCode() {
        return designationCode;
    }

    public void setDesignationCode(String designationCode) {
        this.designationCode = designationCode;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public double getDA() {
        return DA;
    }

    public void setDA(double DA) {
        this.DA = DA;
    }
}
