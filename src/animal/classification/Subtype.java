package animal.classification;

/**
 *
 * @author Luana Andrade
 *
 */
public enum Subtype {

    MAMMAL, REPTILE, AVIAN, AQUATIC, INSECT, NULL;

    public String toString() {
        return name();
    }

}
