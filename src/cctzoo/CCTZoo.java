package cctzoo;

import animal.Animal;
import animal.Aquatic;
import animal.Avian;
import animal.Mammal;
import animal.Offspring;
import animal.Reptile;
import animal.Insect;
import animal.classification.Subtype;
import data.SetupData;
import employee.*;
import utilities.RandomDate;
import data.StoreData;
import java.util.ArrayList;
import menu.Menu;
import animal.Medication;

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

        /*
         Mammal mahh = new Mammal("Luana", 'F', "dob", "dateArrival", true);
         Mammal dog = new Mammal ("Ferreira",'M', "02.03.2017"," 03.04.2017", false, Subtype.AVIAN);
         Insect lll = new Insect ("vxvxb", 'F', "tyrt","fhfgh", true );
         Insect mmm = new Insect ("ddgd", 'M', "213", "3356", false, Subtype.AQUATIC);
         Aquatic aq = new Aquatic("", 'f', "", "", true, false);
         Aquatic fg = new Aquatic("", 'f', "", "", false, Subtype.REPTILE, false);
         Avian hj =  new Avian("", 'f', "", "", true);
         Avian jk = new Avian ("", 'm', "","", false, Subtype.MAMMAL);
         Reptile kl = new Reptile("", 'f', "", "", true);
         Reptile df = new Reptile("", 'f', "", "", false, Subtype.AQUATIC);
         

         System.out.println(mahh.toString());
         System.out.println(dog.toString());
         System.out.println(lll.toString());
         System.out.println(mmm.toString());
         System.out.println(aq.toString());
         System.out.println(fg.toString());
         System.out.println(hj.toString());
         System.out.println(jk.toString());
         System.out.println(kl.toString());
         System.out.println(df.toString());
         
         Zookeeper zk = new Zookeeper("Luana", "jhg", "uoi", "uyguhb");
         System.out.println(zk.toString());
         /**/
        
        //SetupData sd = new SetupData(100, 40);
       // Menu mn = new Menu();
       
       Medication mn = new Medication ("0.02", "hku","fohalfshioialsk");
       
        System.out.println(mn.toString());
        
        //Animal.list("MAMMAL");
         
        

    
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
//        for (String animalDob : StoreData.animalDob) {
//            //System.out.println(animalDob);
//        }
//        SetupData sd = new SetupData(100, 40);
//    }

       

    }
}
