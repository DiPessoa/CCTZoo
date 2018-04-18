package animal;

import animal.classification.Type;
import interfaces.IMessage;

/**
 *
 * @author Diogo Pessoa
 */
public class Reptile extends Animal{

    private boolean shedSkin;

    public Reptile (int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType) {
        super(animalID, name, gender, dob, dateArrival, parents, subType);

    }

    public Reptile (int animalID, String name, char gender, String dob, String dateArrival, int[] parents) {
        super(animalID, name, gender, dob, dateArrival, parents);

    }
    
    public boolean isSheddingSkin() {
        return shedSkin;
    }

    public void setShedSkin(boolean shedSkin) {
        this.shedSkin = shedSkin;
    }
}