package animal;

import animal.classification.Type;
import interfaces.IMessage;

/**
 *
 * @author Diogo Pessoa
 */
public class Mammal extends Animal{

    private boolean pregnancy;

    public Mammal(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType) {
        super(animalID, name, gender, dob, dateArrival, parents, subType);

    }

    public Mammal(int animalID, String name, char gender, String dob, String dateArrival, int[] parents) {
        super(animalID, name, gender, dob, dateArrival, parents);

    }
    
    public boolean isPregnant() {
        return pregnancy;
    }

    public void setPregnancy(boolean pregnancy) {
        if(getGender() == 'F') {
            this.pregnancy = true;
        }else{
            displayMessage("A male animmal can not be pregnant!");
        }
    }
}