package momo;

import java.util.ArrayList;

public interface IController {
        public ArrayList<Customer> addCus(ArrayList<Customer> listCus);
        public void displayCustomer(ArrayList<Customer> listCus);
        public void tranferMoney(ArrayList<Customer> listCust);
}
