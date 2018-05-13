package animal.classification;

/**
 * Enum Class to define the types and subtypes of the animals
 *
 * @author Luana Andrade
 *
 */
public enum Subtype {

    MAMMAL, REPTILE, AVIAN, AQUATIC, INSECT, NULL;

    /**
     * Method returns a String of an object
     *
     * @return String name
     */
    public String toString() {
        return name();
    }

}
