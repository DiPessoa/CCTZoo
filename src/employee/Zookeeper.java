/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Diogo Pessoa
 */
public class Zookeeper extends Employee{
   private Qualification  firstcare;
   private Qualification  secondcare;
   private Qualification  thirdcare;
   
   
    
    public Zookeeper(String name, String dob, String address, int pps, Qualification firstcare) {
        super(name, dob, address, pps);
        
    }
    
    public Zookeeper(String name, String dob, String address, int pps, Qualification firstcare,Qualification secondcare) {
        super(name, dob, address, pps);     
      
    }
    public Zookeeper(String name, String dob, String address, int pps, Qualification firstcare,Qualification secondcare, Qualification thirdcare) {
        super(name, dob, address, pps);  
     
    }

    public Qualification getFirstcare() {
        return firstcare;
    }

    public Qualification getSecondcare() {
        return secondcare;
    }

    public Qualification getThirdcare() {
        return thirdcare;
    }

    public void setFirstcare(Qualification firstcare) {
        this.firstcare = firstcare;
    }

    public void setSecondcare(Qualification secondcare) {
        this.secondcare = secondcare;
    }

    public void setThirdcare(Qualification thirdcare) {
        this.thirdcare = thirdcare;
    }
    
     
    
    }

    
        
    
    

    
    
    
    
    


