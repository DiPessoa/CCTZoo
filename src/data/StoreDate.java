/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import animal.classification.Subtype;
import animal.Offspring;
import animal.Medication;
import employee.Zookeeper;
        

/**
 *
 * @author Diogo Pessoa
 */
public class StoreDate {
    
    
    public String[] animalNames = new String[]{};
    
    public String[] animalDob = new String[]{};
   
    public char[] animalGender  = new char[]{'M', 'F'};
    
    public String[] animalDateArrival = new String[]{};  
    
    public Subtype[] animalSubtype = new Subtype[]{Subtype.AQUATIC, 
        Subtype.AVIAN, Subtype.INSECT, Subtype.MAMMAL, Subtype.REPTILE};
    
    public String[] animalMedication = new String[] {""};
    
//    public Offspring[] animalOffspring = new Offspring[] {};
    
    public String[] animalDateDod = new String[]{};  
    
    public boolean[] animalIsDead = new boolean[] {true, false};
    
    public boolean[] animalVaccine = new boolean[] {true, false};
    
    public String[] animalZookeeper = new String[] {"Luana", "Diogo", "Luzilene", 
        "Jorge", "Joao", "Gabriel", "Boris", "Jonh", "Eoife", "Eoin", "Dermot", 
        "Gerard", "Michael", "Mark", "Jenny", "Tristan", "Lovelie", 
        "Cloe", "Steve", "Cristoff", "Katleen", "Edward", "Rosalinda",
        "Mellies", "Theresa", "Alisson", "Jamile", "Ace", "Gian", "Jackie", 
        "Justine", "Judith", "Joseph", "Joe", "Patrick", "Mathew", "Angela", 
        "Jessica", "Barbara", "Agnes", "Paolo", "Eva", "Leornad", "Fernando", 
        "Laura", "Rafael", "Eliska", "Mio", "Afonso","Pamela"};
    
    
    
    

   
    
    
}
