package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
    // @Component("dao") Remplacer Component par
    // @Respository pour distinguer les couches dao et metier
@Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getdata() {
        System.out.println("Version base de donnée");
        double temp=23;
        return temp;
    }
}
