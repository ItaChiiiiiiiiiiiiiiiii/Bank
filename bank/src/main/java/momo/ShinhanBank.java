package momo;

public class ShinhanBank extends Bank {

    /*public void interestRate(double baseMoney, double fee, double sumMoney) {

        double interestRate = baseMoney+fee*sumMoney;
    }*/
    public ShinhanBank(){

        setBankLS(0.5f);
    }
    public double countFee(double money){
        double fee = 5000+getBankLS()*money;
        return fee;
    }

}
