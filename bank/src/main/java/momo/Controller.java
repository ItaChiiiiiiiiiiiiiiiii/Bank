package momo;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements IController {
    public ArrayList<Customer> addCus(ArrayList<Customer> listCus) {
        while (true) {

            System.out.println("Chon so 1 de nhap khach hang 2 de thoat");
            Scanner sc = new Scanner(System.in);
            String i = sc.nextLine();
            if (i.equals("1")) {
                Customer c1 = new Customer();
                System.out.println("Moi ban nhap id cua khach hang");
                c1.setCustomerID(sc.nextLine());
                System.out.println("Moi ban nhap ten cua khach hang");
                c1.setCustomerName(sc.nextLine());
                System.out.println("Moi ban nhap vao level cua khach hang");
                c1.setCustomerLevel(sc.nextLine());
                System.out.println("Moi ban nhap vao so du trong tai khoan cua khach hang");
                c1.setCustomerDu(sc.nextDouble());
                listCus.add(c1);
            } else if (i.equals("2")) break;
        }
        return listCus;
    }


    public void displayCustomer(ArrayList<Customer> addCus) {
        for (Customer c1 : addCus
        ) {
            System.out.println(c1.toString());
        }
    }

    @Override
    public void tranferMoney(ArrayList<Customer> listCus) {
        for (Customer c1 : listCus
        ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban nhap vao id khach hang muon chuyen tien");
            String i = sc.nextLine();
            while (true) {
                if (i.equals(c1.getCustomerID())) {

                    System.out.println("Moi ban chon ngan hang de chuyen tien (1: ShinhanBank, 2: HSBCB Bank");
                    String j = sc.nextLine();
                    if (j.equals("1")) {
                        ShinhanBank sb = new ShinhanBank();
                        System.out.println("Moi ban nhap vao so tien muon chuyen");
                        double a = sc.nextDouble();
                        if (a + sb.countFee(a) <= c1.getCustomerDu()) {
                            System.out.println("Hien tai so tien khong du ban vui long nop them tien");
                        } else if (a + sb.countFee(a) > c1.getCustomerDu()) {
                            System.out.println("So tien ban chuyen la: " + a + " va so du trong tai khoan  la: " + (c1.getCustomerDu() - a));
                        }
                    } else if (j.equals("2")) {
                        HSBCBank hs = new HSBCBank();
                        System.out.println("Moi ban nhap vao so tien muon chuyen");
                        double a = sc.nextDouble();
                        if (a + hs.countFee(a) <= c1.getCustomerDu()) {
                            System.out.println("Hien tai so tien khong du ban vui long nop them tien");
                        } else if (a + hs.countFee(a) > c1.getCustomerDu()) {
                            System.out.println("So tien ban chuyen la: " + a + " va so du trong tai khoan  la: " + (c1.getCustomerDu() - a));
                        }
                    }
                }
            }
        }
    }
}
