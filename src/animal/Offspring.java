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
public class Offspring {
    
    private String destination;
    private Animal animal;
    
    
    public Offspring (String destination, Animal animal){
         this.destination = destination;
         this.animal = animal;
         
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public void teste() {
        System.out.println("foi construido");
    }
    
    
}
