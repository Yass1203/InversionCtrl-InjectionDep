package dao;

public class DaoImpl implements IDao {
    @Override
    public double getdata() {
        System.out.println("Version base de donnée");
        double temp=23;
        return temp;
    }
}
