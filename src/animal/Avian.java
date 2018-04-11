/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Diogo Pessoa
 */
public class Avian extends Animal{
        public Avian(int animalID, String name, char gender, String dob, String dateArrival, String[] type) {
        super(animalID, name, gender, dob, dateArrival, type);
        this.type = new String[]{"Avian"};          
   }
}
