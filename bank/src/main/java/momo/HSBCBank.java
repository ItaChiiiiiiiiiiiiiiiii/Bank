package momo;

public class HSBCBank extends Bank {
    public HSBCBank(){
        setBankLS(0.8f);
    }
    public double countFee(double money){
        double fee = 5000+getBankLS()*money;
        return fee;
    }

}
