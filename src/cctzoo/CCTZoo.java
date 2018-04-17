package cctzoo;

import animal.Aquatic;
import animal.Avian;
import animal.Mammal;
import animal.classification.Type;

/**
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 * @author Luzilene Oliveira
 */
public class CCTZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myList = {1, 2};
        Mammal ne = new Mammal(1, "Diogo", 'f', "kkkk", "dateArival", myList, Type.AVIAN);
        System.out.println("Is able to fly? " + ne.isAbleToFly());
        
        Aquatic aq = new Aquatic(1, "Ornitorrinco", 'f', "datadenascimento", "chegou", myList, Type.AVIAN);
        System.out.println("Is able to fly? " + aq.isAbleToFly());
        
        Avian ave = new Avian(0, "", 'f', "", "",myList);
        System.out.println("Is able to fly? " + ave.isAbleToFly());
    }
    
}
