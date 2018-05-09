package employee;

/**
 *
 * @author Luana Andrade
 */
abstract class Employee {
    
    public String name;
    public String dob;
    public String address;
    public String pps;
    public final int employeeID;
    public static int lastemployeeID = 0;
    
    public Employee(){
        employeeID = ++lastemployeeID;
    }

    public Employee(String name, String dob, String address, String pps){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.pps = pps;
        this.employeeID = ++lastemployeeID;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getPps() {
        return pps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}


