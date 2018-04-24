/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import animal.classification.Subtype;

/**
 *
 * @author Diogo Pessoa
 */
public class Zookeeper extends Employee{
   private Subtype  firstcare;
   private Subtype  secondcare;
   private Subtype  thirdcare;
   
   
    
    public Zookeeper(String name, String dob, String address, int pps, Subtype firstcare) {
        super(name, dob, address, pps);
        
    }
    
    public Zookeeper(String name, String dob, String address, int pps, Subtype firstcare,Subtype secondcare) {
        super(name, dob, address, pps);     
      
    }
    public Zookeeper(String name, String dob, String address, int pps, Subtype firstcare,Subtype secondcare, Subtype thirdcare) {
        super(name, dob, address, pps);  
     
    }

    public Subtype getFirstcare() {
        return firstcare;
    }

    public Subtype getSecondcare() {
        return secondcare;
    }

    public Subtype getThirdcare() {
        return thirdcare;
    }

    public void setFirstcare(Subtype firstcare) {
        this.firstcare = firstcare;
    }

    public void setSecondcare(Subtype secondcare) {
        this.secondcare = secondcare;
    }

    public void setThirdcare(Subtype thirdcare) {
        this.thirdcare = thirdcare;
    }
    
     
    
    }

    
        
    
    

    
    
    
    
    


