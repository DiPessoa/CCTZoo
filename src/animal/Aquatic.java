package animal;

import animal.classification.Subtype;

/**
 * Class of an Aquatic object where is possible find all variables and methods
 * about aquatic animals
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Aquatic extends Animal {

    private boolean marine;

    /**
     * Constructor Method no parameters
     */
    public Aquatic() {

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
     * @param marine - Boolean - Is marine?
     *
     */
    public Aquatic(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subtype, boolean marine) {
        super(name, gender, dob, dateArrival, offSpring, subtype);
        this.marine = marine;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     * @param marine - Boolean - Is marine?
     *
     */
    public Aquatic(String name, char gender, String dob, String dateArrival, boolean offSpring, boolean marine) {
        super(name, gender, dob, dateArrival, offSpring);
        this.marine = marine;
    }

    /**
     * Method returns whether animal is marine
     *
     * @return marine Boolean
     */
    public boolean isMarine() {
        return marine;
    }

    /**
     * Method returns String that tells whether animal is marine
     *
     * @return String
     */
    @Override
    public String getString() {
        return "  Marine: " + Boolean.toString(marine) + "\n";
    }

}
