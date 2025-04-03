package ex;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao{

        @Override
        public double getdata() {
            System.out.println("Version Web service");

            double temp=11;
            return temp;
        }
    }
