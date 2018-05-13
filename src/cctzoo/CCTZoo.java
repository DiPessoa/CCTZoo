/**
 * Created on 1st of March of 2018
 * for a Assignment Project
 * Module Object Oriented Constructs
 */
/**
 * @author Diogo Pessoa 2016326
 * @author Luana Andrade 2016270
 * @author Luzilene OLiveira 2016299
 */
package cctzoo;

import data.SetupData;
import menu.Menu;

/**
 * Main Class
 *
 * @version 1.0
 */
public class CCTZoo {

    /**
     * Main method call methods and hold a instance
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * This instance generates randomly 100 animals and 40 keepers, as
         * arguments
         */
        SetupData sd = new SetupData(100, 40);

        /**
         * This method invokes the console menu
         */
        Menu mn = new Menu();

    }
}
