package animal;

import animal.classification.Subtype;

/**
 * Class of an Avian object where is possible find all variables and methods
 * about avian animals
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Avian extends Animal {

    private boolean hatchEgg;

    /**
     * Constructor Method no parameters
     */
    public Avian() {

    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     * @param subtype - Subtype - Animal's subtype
     * @param hatchEgg - Boolean - Is hatching a egg?
     *
     */
    public Avian(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subtype, Boolean hatchEgg) {
        super(name, gender, dob, dateArrival, offSpring, subtype);
        this.hatchEgg = hatchEgg;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     * @param hatchEgg - Boolean - Is hatching a egg?
     *
     */
    public Avian(String name, char gender, String dob, String dateArrival, boolean offSpring, Boolean hatchEgg) {
        super(name, gender, dob, dateArrival, offSpring);
        this.hatchEgg = hatchEgg;
    }

    /**
     * Method returns whether animal is hatching
     *
     * @return hatchEgg Boolean
     */
    public boolean isHatching() {
        return hatchEgg;
    }

    /**
     * Method set if animal is hatching
     *
     * @param hatchEgg Boolean
     */
    public void setHatching(boolean hatchEgg) {
        this.hatchEgg = hatchEgg;
    }

    /**
     * Method returns String that tells whether animal is hatching
     *
     * @return String
     */
    @Override
    public String getString() {
        return "  Hatch Egg: " + Boolean.toString(hatchEgg) + "\n";
    }

}
