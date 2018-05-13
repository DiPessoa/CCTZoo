package employee;

/**
 * Abstract Class of an Employee
 *
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

    /**
     * Constructor Method no parameters
     */

    public Employee() {
        employeeID = ++lastemployeeID;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Employee's name
     * @param dob - String - Employee's date of birth
     * @param address - String - Employee's Address
     * @param pps - String - Employee's pps
     *
     *
     */
    public Employee(String name, String dob, String address, String pps) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.pps = pps;
        this.employeeID = ++lastemployeeID;
    }

    /**
     * Method returns the employee's name
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Method returns the employee's dob
     *
     * @return String dob
     */

    public String getDob() {
        return dob;
    }

    /**
     * Method returns the employee's address
     *
     * @return String address
     */

    public String getAddress() {
        return address;
    }

    /**
     * Method returns the employee's pps
     *
     * @return String pps
     */

    public String getPps() {
        return pps;
    }

    /**
     * Method returns the employee's ID number
     *
     * @return Integer idNumber
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Method sets name
     *
     * @param name String
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method sets dob
     *
     * @param dob String
     */

    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Method sets address
     *
     * @param address String
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method sets pps
     *
     * @param dob String
     */

    public void setPps(String pps) {
        this.pps = pps;
    }

}
