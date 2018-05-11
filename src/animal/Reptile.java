package animal;

import animal.classification.Subtype;

/**
 * Class of a Reptile object where is possible find all variables and methods
 * about reptile animals
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Reptile extends Animal {

    private boolean shedSkin;

    /**
     * Constructor Method no parameters
     */
    public Reptile() {

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
     * @param shedSkin - Boolean - Shedding Skin
     *
     */
    public Reptile(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subtype, boolean shedSkin) {
        super(name, gender, dob, dateArrival, offSpring, subtype);
        this.shedSkin = shedSkin;
    }

    /**
     * Constructor Method
     *
     * @param name - String - Animal's name
     * @param gender - Character - Animal's gender
     * @param dob - String - Animal's date of birth
     * @param dateArrival - String - Animal's date of arrival in the zoo
     * @param offSpring - Boolean - Animal's offspring
     * @param shedSkin - Boolean - Shed Skin
     *
     */
    public Reptile(String name, char gender, String dob, String dateArrival, boolean offSpring, boolean shedSkin) {
        super(name, gender, dob, dateArrival, offSpring);
        this.shedSkin = shedSkin;
    }

    /**
     * Method returns whether animal is shedding skin
     *
     * @return shedSkin Boolean
     */
    public boolean isSheddingSkin() {
        return shedSkin;
    }

    /**
     * Method set if animal is shedding skin
     *
     * @param shedSkin Boolean
     */
    public void setShedSkin(boolean shedSkin) {
        this.shedSkin = shedSkin;
    }

    /**
     * Method returns String that tells whether animal is shedding skin
     *
     * @return String
     */
    @Override
    public String getString() {
        return "  Shed Skin: " + Boolean.toString(shedSkin) + "\n";
    }
}
