package cctzoo;

import animal.Aquatic;
import animal.Avian;
import animal.Mammal;
import animal.Offspring;
import animal.Reptile;
import animal.classification.Subtype;
import employee.*;
import utilities.RandomDate;
import data.StoreDate;

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

//        Mammal macaco = new Mammal(1, "Diogo", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//        System.out.println("Is able to fly? " + macaco.isAbleToFly());
//
//        Aquatic camarao = new Aquatic(1, "Ornitorrinco", 'f', "datadenascimento", "chegou", Subtype.AVIAN, true);
//        System.out.println("Is able to fly? " + camarao.isAbleToFly());
//
//        Avian ave = new Avian(0, "", 'f', "", "");
//        System.out.println("Is able to fly? " + ave.isAbleToFly());
//        
//        Reptile cobra = new Reptile(22, "Lu", 'M', "23/11/2018", "22/11/2019", Subtype.AQUATIC);
//        System.out.println("Is able to swin?" + cobra.isAbleToSwin());
//        
//        
//        System.out.println(cobra.isDead());
//        
//        Offspring macaquinho = new Offspring("CCTZoo", macaco);
//        
//        macaquinho.teste();
//        
//        Zookeeper k1 = new Zookeeper("Mark", "21/1963", "Ballyogan",12345, Subtype.AQUATIC);
//        Zookeeper k2 = new Zookeeper("Mark", "21/1963", "Ballyogan",12345, Subtype.AQUATIC, Subtype.INSECT);
//        
//        
//       String date = RandomDate.getRandomDate(2000, 2010);
//       Zookeeper zk = new Zookeeper("Gabriel", date, "Endereco", 0);
//       zk.setAnimalType(Subtype.REPTILE);
//       zk.setAnimalType(Subtype.AVIAN);
//       zk.setAnimalType(Subtype.MAMMAL);
//       
//       Mammal macaco = new Mammal(1, "Diogo", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal abc = new Mammal(1, "Gabriel", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal def = new Mammal(1, "Joao", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal hij = new Mammal(1, "Malaquias", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal klm = new Mammal(1, "Ronaldo", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal nop = new Mammal(1, "Astolfo", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal qrs = new Mammal(1, "Jorge", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       Mammal tuv = new Mammal(1, "Ubirata", 'f', "kkkk", "dateArival", Subtype.AVIAN);
//       
//       zk.addAnimal(macaco);
//       zk.addAnimal(abc);
//       zk.addAnimal(def);
//       zk.addAnimal(hij);
//       zk.addAnimal(klm);
//       zk.addAnimal(nop);
//       zk.addAnimal(qrs);
//       zk.addAnimal(tuv);
//       
//        System.out.println(zk.getAnimalsList());
//        String[] dates = new String[100];
//
//        for (int i = 0; i <= dates.length; i++) {
//            String randomDate = RandomDate.getRandomDate(2000, 2017);
//            dates[i] = randomDate;
//            System.out.println(dates[i]);
//
//        }
//
////        for (String i : dates) {
////            System.out.println(i);
////        }
//    RandomDate.populateArray(2000, 2018);
//StoreDate.populateArray(1900, 1920);


        for (int i = 0; i < StoreDate.animalDob.length; i++) {
            System.out.println(StoreDate.animalDob[i]);
        }

;
        
        
    }

}
