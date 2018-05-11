package animal;

import animal.classification.Subtype;

/**
 * Class of a Mammal object where is possible find all variables and methods
 * about mammal animals
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Mammal extends Animal {

    private boolean pregnancy;

    /**
     * Constructor Method no parameters
     */
    public Mammal() {

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
     *
     */
    public Mammal(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subtype) {
        super(name, gender, dob, dateArrival, offSpring, subtype);
        setPregnancy(gender == 'f');
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
    public Mammal(String name, char gender, String dob, String dateArrival, boolean offSpring) {
        super(name, gender, dob, dateArrival, offSpring);
        setPregnancy(gender == 'f');
    }

    /**
     * Method returns whether animal is pregnant
     *
     * @return Boolean isPregnant
     */
    public boolean isPregnant() {
        return pregnancy;
    }

    /**
     * Method sets pregnancy
     *
     * @param pregnancy Boolean
     */
    public void setPregnancy(boolean pregnancy) {
        if (getGender() == 'F') {
            this.pregnancy = true;
        } else {
            System.out.println("A male animmal can not be pregnant!");
        }
    }

    /**
     * Method returns String that tells whether animal is pregnant
     *
     * @return marine String
     */
    @Override
    public String getString() {
        return "  Pregnancy: " + Boolean.toString(pregnancy) + "\n";
    }

    /**
     * Method returns String that tells animals type
     *
     * @return String
     */
    @Override
    public String getType() {
        String type = getClass().getName().substring(getClass().getName().indexOf(".") + 1, getClass().getName().length());
        return type.toUpperCase();
    }
}
