package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        // Pour que Spring scanner les annotation et non pas le XML

        // ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        ApplicationContext context = new AnnotationConfigApplicationContext("ex","metier");
        IMetier metier = (IMetier) context.getBean(IMetier.class);

        System.out.println("RES= "+ metier.calcul());

    }
}
