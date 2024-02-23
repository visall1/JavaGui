
package swing;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Market {
    String code,name;
    float qty,price,total;
    public Market(String code,String name,float qty,float price,float total){
        this.code=code;
        this.name=name;
        this.qty=qty;
        this.price=price;
        this.total=total;
    }
    static ArrayList<Market> mark = new ArrayList<>();

    Market(String text, String text0, float parseFloat, float parseFloat0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Market(String text, String text0, float parseFloat, float parseFloat0, float parseFloat1, float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
