package animal;

/**
 * Abstract Class of an Animal 
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 *
 */

import animal.classification.Subtype;
import data.SetupData;
import interfaces.IAquatic;
import interfaces.IAvian;
import java.util.ArrayList;
import employee.Zookeeper;


public abstract class Animal implements IAvian, IAquatic {

    /**
    *Generates the animal's ID automatically
    */
    private final int idNumber;
    public static int lasteIdNumber = 0;
    private String name;
    private String dob;
    private char gender;
    private String dateArrival;
    private Subtype subtype;
    private boolean vaccine = false;
    private static ArrayList<Medication> drugs = new ArrayList<>();
    public boolean offSpring = false;
    private Zookeeper zookeeper;

    /**
     * Constructor Method
     * no parameters
     */
    public Animal() {
        idNumber = ++lasteIdNumber;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param subType - Subtype - Animal's subtype
     * @param  offSpring - Boolean - Animal's offspring
     * @param zookeeper - Zookeeper - Animal's zookeeper
     *
     */
    public Animal(String name, char gender, String dob, String dateArrival, Subtype subType, boolean offSpring, Zookeeper zookeeper) {
        idNumber = ++lasteIdNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.offSpring = offSpring;
        this.zookeeper = zookeeper;
    }

     /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param subType - Subtype - Animal's subtype
     * @param  offSpring - Boolean - Animal's offspring
     *
     */
    public Animal(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType) {
        idNumber = ++lasteIdNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.offSpring = offSpring;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     * @param zookeeper - Zookeeper - Animal's zookeeper
     *
     */
    public Animal(String name, char gender, String dob, String dateArrival, boolean offSpring, Zookeeper zookeeper) {
        idNumber = ++lasteIdNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.offSpring = offSpring;
        this.zookeeper = zookeeper;
    }

     /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     *
     */
    public Animal(String name, char gender, String dob, String dateArrival, boolean offSpring) {
        idNumber = ++lasteIdNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.offSpring = offSpring;
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
     * Method sets gender
     *
     * @param gender String
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Method sets date of arrival
     *
     * @param dateArrival String
     */
    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    /**
     * Method sets the animal's subtype
     *
     * @param subType Subtype
     */
    public void setSubtype(Subtype subType) {
        this.subtype = subType;
    }
    
    /**
     * Method sets offspring
     *
     * @param offSpring Boolean
     */
    public void setOffSpring(boolean offSpring) {
        this.offSpring = offSpring;
    }

    /**
     * Method sets vaccine
     *
     * @param vaccine Boolean
     */
    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }
    
    /**
     * Method add a Medication object
     *
     * @param medication Medication
     */
    public static void addMedication(Medication medication) {
        drugs.add(medication);
    }

    /**
     * Method add a Zookeeper object
     *
     * @param zookeeper Zookeeper
     */
    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    /**
     * Method returns the animal's name
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

     /**
     * Method returns the animal's dob
     *
     * @return String dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * Method returns the animal's gender
     *
     * @return String gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Method returns the animal's date of arrival
     *
     * @return String date of arrival
     */
    public String getDateArrival() {
        return dateArrival;
    }

    /**
     * Method returns the animal's ID number
     *
     * @return Integer idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Method returns the animal's zookeeper
     *
     * @return Zookeeper zookeeper
     */
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

      /**
     * Method returns whether the animal has offspring
     *
     * @return Boolean offSpring
     */
    public boolean isOffSpring() {
        return offSpring;
    }

    /**
     * Method returns the animal's subtype
     *
     * @return Subtype subtype
     */
    public Subtype getSubtype() {
        return subtype;
    }

 
    @Override
    public boolean isAbleToFly() {
        return getSubtype() == Subtype.AVIAN || this instanceof Avian;
    }

    @Override
    public boolean isAbleToSwin() {
        return getSubtype() == Subtype.AQUATIC || this instanceof Aquatic;
    }

    public String getType() {
        String type = getClass().getName().substring(getClass().getName().indexOf(".") + 1, getClass().getName().length());
        return type.toUpperCase();
    }

    public String getString() {
        return "";
    }

    public static ArrayList<Animal> list(String type) {

        System.out.println(SetupData.getAnimalList().size());

        ArrayList<Animal> list = new ArrayList<>();

        for (Animal currentAnimal : SetupData.getAnimalList()) {
            if (currentAnimal.getType().equals(type)) {
                list.add(currentAnimal);
                System.out.println("---------------------------------------------------");
                System.out.print("ID: " + currentAnimal.getIdNumber());
                System.out.print(" | Name: " + currentAnimal.getName());
                System.out.println(" | Type: " + currentAnimal.getType());
            }
        }

        return list;
    }

    @Override
    public String toString() {
        String output;
        String subtype = getSubtype() == null ? "Undefined" : this.getSubtype().toString();

        output = "----------------------Animal----------------------\n";
        output += "  NAME: " + this.name + "\n";
        output += "  Type: " + this.getType() + " | Subtype: " + subtype + "\n";
        output += "  ID: " + this.idNumber + "\n";
        output += "  Date of Birth: " + this.dob + " | Gender: " + this.gender + "\n";
        output += "  Date of Arrival: " + this.dateArrival + "\n";
        output += "  Vaccine: " + this.vaccine + "\n";
        output += "  Medication: \n" + drugs.toString() + "\n";
        output += "  Offspring: " + this.offSpring + "\n";
        output += this.getString();
        output += this.zookeeper + "\n";

        return output;
    }

}
