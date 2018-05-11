package animal;

import animal.classification.Subtype;

/**
 * Class of an Insect object where is possible find all variables and methods
 * about insect animals
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Insect extends Animal {

    private boolean layEgg;

    /**
     * Constructor Method no parameters
     */
    public Insect() {

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
     * @param layEgg - Boolean - Did it lay a egg?
     *
     */
    public Insect(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subtype, Boolean layEgg) {
        super(name, gender, dob, dateArrival, offSpring, subtype);
        this.layEgg = layEgg;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     * @param layEgg - Boolean - Did it lay a egg?
     *
     */
    public Insect(String name, char gender, String dob, String dateArrival, boolean offSpring, Boolean layEgg) {
        super(name, gender, dob, dateArrival, offSpring);
        this.layEgg = layEgg;
    }

    /**
     * Method returns whether animal laid an egg
     *
     * @return marine Boolean
     */
    public boolean isLayingEgg() {
        return layEgg;
    }

    /**
     * Method set if animal laid an egg
     *
     * @param layEgg Boolean
     */
    public void setLayEgg(boolean layEgg) {
        this.layEgg = layEgg;
    }

    /**
     * Method returns String that tells whether animal is hatching
     *
     * @return String
     */
    @Override
    public String getString() {
        return "  Lay Egg: " + Boolean.toString(layEgg) + "\n";
    }

}
