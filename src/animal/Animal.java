package animal;

import animal.classification.Subtype;
import data.SetupData;
import interfaces.IAquatic;
import interfaces.IAvian;
import java.util.ArrayList;
import employee.Zookeeper;

/**
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public abstract class Animal implements IAvian, IAquatic {

    private final int exibitNumber;
    public static int lastexibitNumber = 0;
    private String name;

    private String dob;
    private char gender;
    private String dateArrival;
    private Subtype subtype;

    private boolean vaccine = false;

    private static ArrayList<Medication> drugs = new ArrayList<>();
    public boolean offSpring = false;
    private Zookeeper zookeeper;

    public Animal() {
        exibitNumber = ++lastexibitNumber;
    }

    public Animal(String name, char gender, String dob, String dateArrival, Subtype subType, boolean offSpring, Zookeeper zookeeper) {
        exibitNumber = ++lastexibitNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.offSpring = offSpring;
        this.zookeeper = zookeeper;
    }

    public Animal(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType) {
        exibitNumber = ++lastexibitNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.offSpring = offSpring;
        this.zookeeper = zookeeper;
    }

    public Animal(String name, char gender, String dob, String dateArrival, boolean offSpring, Zookeeper zookeeper) {
        exibitNumber = ++lastexibitNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.offSpring = offSpring;
        this.zookeeper = zookeeper;
    }

    public Animal(String name, char gender, String dob, String dateArrival, boolean offSpring) {
        exibitNumber = ++lastexibitNumber;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.offSpring = offSpring;
        this.zookeeper = zookeeper;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public void setOffSpring(boolean offSpring) {
        this.offSpring = offSpring;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public static void addMedication(Medication medication) {
        drugs.add(medication);
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public int getExibitNumber() {
        return exibitNumber;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public boolean isOffSpring() {
        return offSpring;
    }

    public Subtype getSubtype() {
        return subtype;
    }

    public void setSubtype(Subtype subType) {
        this.subtype = subType;
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
                System.out.print("ID: " + currentAnimal.getExibitNumber());
                System.out.print(" | Name: " + currentAnimal.getName());
                System.out.println(" | Type: " + currentAnimal.getType());
            }
        }

        return list;
    }

    public void remove() {

    }

    @Override
    public String toString() {
        String output;
        String subtype = getSubtype() == null ? "Undefined" : this.getSubtype().toString();

        output = "---------------------------------------------------" + "\n";
        output += "--- Name: " + this.name + " | Type: " + this.getType() + " | Subtype: " + subtype + " ----\n";
        output += "  ID: " + this.exibitNumber + "\n";
        output += "  Date of Birth: " + this.dob + " | Gender: " + this.gender + "\n";
        output += "  Date of Arrival: " + this.dateArrival + "\n";
        output += "  Vaccine: " + this.vaccine + "\n";
        output += "  Medication:" + drugs.toString() + "\n";
        output += "  Offspring: " + this.offSpring + "\n";
        output += this.getString();
        output += this.zookeeper + "\n";
        

        return output;
    }

}
