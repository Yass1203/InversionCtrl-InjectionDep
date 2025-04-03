package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        // Chercher le fichier config.xml  - puis faire la creation et l'injection
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //
        IMetier metier = (IMetier) context.getBean("metier");

        // Recuperer le bean via l'interface
        // IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res = "+ metier.calcul());
    }
}
