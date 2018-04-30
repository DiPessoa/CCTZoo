package employee;

/**
 *
 * @author Luana Andrade
 */
abstract class Employee {
    
    private String name;
    private String dob;
    private String address;
    private String pps;
    
    public Employee(){

    }

    public Employee(String name, String dob, String address, String pps){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.pps = pps;

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

    

}


