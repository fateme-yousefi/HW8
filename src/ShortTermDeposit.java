public class ShortTermDeposit extends Deposit {

    public ShortTermDeposit() {

    }


    @Override
    void deptor() {
        if (getDepositAmount() - getAmount() < 2000) {

        } else {
            setDepositAmount(getDepositAmount() - getAmount());
        }

    }

    @Override
    void creditor() {
        setDepositAmount(getDepositAmount() + getAmount());

    }

    @Override
    void monthInterest() {
        double rate = 0.1;
        setDepositAmount(getDepositAmount() + (getDepositAmount() * rate / 12));

    }
}
