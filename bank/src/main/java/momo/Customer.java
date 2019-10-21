package momo;

public class Customer {
    private String customerID;
    private String customerName;
    private String customerLevel;
    private double customerDu;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public double getCustomerDu() {
        return customerDu;
    }

    public void setCustomerDu(double customerDu) {
        this.customerDu = customerDu;
    }
    @Override
    public String toString(){
        return "[Customer]"+"=[CustomerID= "+getCustomerID()+", CustomerName="+getCustomerName()+", CustomerLevel ="+getCustomerLevel()+", CustomerExtraMoney"+getCustomerDu();
    }
}
