package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component("dao") Remplacer Component par
// @Service pour distinguer les couches dao et metier
@Service("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;

    /*public MetierImpl() {}*/
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getdata();
        double res = t * 23;
        return res;
    }
    /**
     * Pour Injecter dans la variable un object
     * d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
