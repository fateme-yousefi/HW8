public abstract class Deposit {
    private String customerName;
    private double depositAmount;
    private double amount;

    public Deposit(){

    }

    public void setCutomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


    abstract void deptor();

    abstract void creditor();

    abstract void monthInterest();

}

