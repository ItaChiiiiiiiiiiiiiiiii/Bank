package momo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Controller c1 = new Controller();
        ArrayList<Customer> listCus = new ArrayList<>();
        listCus = c1.addCus(listCus);
        c1.displayCustomer(listCus);
        c1.tranferMoney(listCus);
    }
}
