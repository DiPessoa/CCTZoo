package employee;

import animal.classification.Subtype;
import animal.Animal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Class of a zookeeper where it is possible to find all methods that qualify a
 * zookeeper.
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Zookeeper extends Employee {

    private final int maxAnimals = 10;
    public static int maxTypes = 3;

    private Subtype[] animalsType = new Subtype[maxTypes];
    private ArrayList<Animal> animalsList = new ArrayList<>();

    private Random randomNum = new Random();

    /**
     * Constructor Method no parameters
     */
    public Zookeeper() {

    }

    /**
     * Constructor Method
     *
     * @param name - String - zookeeper's name
     * @param dob - String - zookeeper's date of birth
     * @param address - String - zookeeper's address
     * @param pps - String - zookeeper's pps
     *
     */

    public Zookeeper(String name, String dob, String address, String pps) {
        super(name, dob, address, pps);
    }

    /**
     * Method add an animal to the animal's list if it is compatible and do not
     * exceed max count
     */

    public void addAnimal(Animal animal) {
        if (isAnimalCompatible(animal)) {
            if (getAnimalsCount() < maxAnimals) {
                animalsList.add(animal);
            }
        }
    }

    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    /**
     * Method count animal's list
     *
     * @return integer type
     */
    public int getAnimalsCount() {
        return animalsList.size();
    }

    /**
     * Method returns an animal's list with the name of the animal
     *
     * @return String list
     */
    public String getAnimalsList() {

        String list = "";
        for (Animal currentAnimal : animalsList) {
            list += currentAnimal.getName() + "\n";
        }
        return list;
    }

    /**
     * Method sets a Type to an Animal
     *
     *
     */

    public void setAnimalType(Subtype type) {

        if (hasAnimalType(type)) {
            return;
        }

        for (int i = 0; i < animalsType.length; i++) {
            if (animalsType[i] == null) {
                animalsType[i] = type;
                return;
            }
        }
    }

    /**
     * Method boolean to check if toString and getType are compatible
     *
     * @return Boolean
     */

    public boolean isAnimalCompatible(Animal animal) {
        try {
            for (Subtype at : animalsType) {
                if (at.toString().equals(animal.getType())
                        || at.toString().equals(animal.getSubtype().toString())) {
                    return true;
                }
            }
        } catch (Exception e) {

        }

        return false;
    }

    /**
     * Method boolean to check if the count is less than 10
     *
     * @return Boolean animalList
     */

    public boolean isAvailable() {
        return animalsList.size() < 10;
    }

    /**
     * Method boolean to check each animal has a type
     *
     * @return Boolean
     */

    private boolean hasAnimalType(Subtype type) {
        for (int i = 0; i < animalsType.length; i++) {
            if (animalsType[i] == type) {
                return true;
            }
        }
        return false;

    }

    /**
     * Method that allows to get animal's type from subtype method
     *
     * @return Subtype animalsType
     */

    public Subtype[] getAnimalsType() {
        return animalsType;
    }

    /**
     * Method returns a String of an object
     *
     * @return String output
     */

    @Override
    public String toString() {
        String output;
        String qualifications = "  Qualification: ";

        output = "----------------------Zookeeper--------------------\n";
        output += "  Name: " + this.name + "\n";
        output += "  ID: " + this.employeeID + "\n";
        output += "  Date of Birth : " + this.dob + "\n";
        output += "  Address: " + this.address + "\n";
        output += "  PPS Number: " + this.pps + "\n";
        for (Subtype subtype : animalsType) {
            qualifications += subtype + " | ";
        }
        output += qualifications;
        return output;
    }
}
