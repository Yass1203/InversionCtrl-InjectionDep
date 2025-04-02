package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao =(IDao) cDao.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            // instanciation via le constructeur par parametre
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);


            // instanciation  via le seter par parametre
            Method setDao = cMetier.getMethod("setDao", IDao.class);
            // invoke(executer) c a d j'execute la methode sur l'object metier , on passe par parametre objet dao
            setDao.invoke(metier ,dao);
            System.out.println("Resultas: " + metier.calcul());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
