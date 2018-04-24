/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import animal.classification.Subtype;
import animal.Animal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Diogo Pessoa
 */
public class Zookeeper extends Employee{
       
    private final int maxAnimals = 10;
    private final int maxTypes = 3;
    
    private final Subtype[] animalsType = new Subtype[maxTypes];
    private final ArrayList<Animal> animalsList = new ArrayList<>();
    
    public Zookeeper(String name, String dob, String address, int pps) {
        super(name, dob, address, pps);
    }
    
    public void addAnimal(Animal animal){
        if(isAnimalCompatible(animal)){
            if(getAnimalsCount() < maxAnimals){
                animalsList.add(animal);
            }
        }
    }
    
    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }
    
    public int getAnimalsCount(){
        return animalsList.size();
    }
    
    public String getAnimalsList(){
        //TODO: corrigir metodo pra imprimir uma string decente
        String list = "";
        for (Animal currentAnimal: animalsList) {
            list += currentAnimal.getName() + "\n";
        }
        return list;
    }
    
    public void setAnimalType(Subtype type){
        // verifica se ja nao esta na lista
        if(hasAnimalType(type)){
            return;
        }
        
        for (int i = 0; i < animalsType.length; i++) {
            if (animalsType[i] == null) {
                animalsType[i] = type;
                return;
            }
        }
    }
    
    private boolean isAnimalCompatible(Animal animal){
        for (Subtype at : animalsType) {
            if (
                 at.toString().equals(animal.getType())
                    ||
                 at.toString().equals(animal.getSubtype().toString())
               )
            {
                return true;
            }
        }
        return false;
    }
    
    private boolean hasAnimalType(Subtype type){
        for (int i = 0; i < animalsType.length; i++) {
            if (animalsType[i] == type) {
                return true;
            }
        }
        return false;
    }
  }