package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;


    @Override
    public double calcul() {
        double t = dao.getdata();
        double res = t * 23;
        return res;
    }

    public MetierImpl() {}
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    /**
     * Pour Injecter dans la variable un object
     * d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
