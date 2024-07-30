public class StoredDeposit extends Deposit {

    public StoredDeposit() {

    }

    @Override
    void deptor() {

        setDepositAmount(getDepositAmount() - getAmount());

    }

    @Override
    void creditor() {
        setDepositAmount(getDepositAmount() + getAmount());

    }

    @Override
    void monthInterest() {

    }
}
