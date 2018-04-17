package animal;

import animal.classification.Type;
import interfaces.IMessage;

/**
 *
 * @author Diogo Pessoa
 */
public class Aquatic extends Animal{
    
    public Aquatic(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType) {
        super(animalID, name, gender, dob, dateArrival, parents, subType);

    }

    public Aquatic(int animalID, String name, char gender, String dob, String dateArrival, int[] parents) {
        super(animalID, name, gender, dob, dateArrival, parents);

    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }

}