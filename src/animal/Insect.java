package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Insect extends Animal {

    private boolean layEgg;
    
    public Insect(){
    
    }

    public Insect(String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(name, gender, dob, dateArrival, subType);

    }

    public Insect(String name, char gender, String dob, String dateArrival) {
        super(name, gender, dob, dateArrival);

    }

    public boolean isLayingEgg() {
        return layEgg;
    }

    public void setLayEgg(boolean layEgg) {
        this.layEgg = layEgg;
    }

}
