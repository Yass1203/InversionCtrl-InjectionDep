package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /* Injection des dépendances instanciation statique
         */
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d); // Injection via le constructeur
        //metier.setDao(d); // Injection via le setter
        System.out.println("Result: " + metier.calcul());

    }
}
