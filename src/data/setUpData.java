/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import animal.Animal;
import employee.Zookeeper;
import java.util.ArrayList;

/**
 *
 * @author Diogo Pessoa
 */
public class setUpData {
    
    public ArrayList<Animal>   currentAnimal  = new ArrayList();
    public ArrayList<Zookeeper>   currentKeepers  = new ArrayList();
    
    private int animalCount = 0;
    private int zookeeperCount = 0;
    
    public setUpData(){
     
        createAnimal();
        createZookeeper();
        
        
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getZookeeperCount() {
        return zookeeperCount;
    }

    public void setZookeeperCount(int zookeeperCount) {
        this.zookeeperCount = zookeeperCount;
    }
    
    
    
    
    
}
