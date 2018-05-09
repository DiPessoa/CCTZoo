
package animal.classification;

/**
 *
 * @author Diogo Pessoa
 
 */
public enum Subtype {
    
    MAMMAL, REPTILE, AVIAN, AQUATIC, INSECT, NULL;
    
    public String toString() {
        return name();
    }
    
}
