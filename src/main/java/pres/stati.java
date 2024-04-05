package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class stati {
    public static void main(String[] args) {
        System.out.println("stati");
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());

    }


}
