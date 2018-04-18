package cctzoo;

import animal.Aquatic;
import animal.Avian;
import animal.Mammal;
import animal.Offspring;
import animal.Reptile;
import animal.classification.Subtype;
import employee.*;

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

        Mammal macaco = new Mammal(1, "Diogo", 'f', "kkkk", "dateArival", Subtype.AVIAN);
        System.out.println("Is able to fly? " + macaco.isAbleToFly());

        Aquatic camarao = new Aquatic(1, "Ornitorrinco", 'f', "datadenascimento", "chegou", Subtype.AVIAN, true);
        System.out.println("Is able to fly? " + camarao.isAbleToFly());

        Avian ave = new Avian(0, "", 'f', "", "");
        System.out.println("Is able to fly? " + ave.isAbleToFly());
        
        Reptile cobra = new Reptile(22, "Lu", 'M', "23/11/2018", "22/11/2019", Subtype.AQUATIC);
        System.out.println("Is able to swin?" + cobra.isAbleToSwin());
        
        
        System.out.println(cobra.isDead());
        
        Offspring macaquinho = new Offspring("CCTZoo", macaco);
        
        macaquinho.teste();
        
        Zookeeper k1 = new Zookeeper("Mark", "21/1963", "Ballyogan",12345, Qualification.AQUATIC);
Zookeeper k2 = new Zookeeper("Mark", "21/1963", "Ballyogan",12345, Qualification.AQUATIC, Qualification.INSECT);
        
        
        
        
    }

}
