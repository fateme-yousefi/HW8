import java.math.BigDecimal;

public class LongTermDeposit extends Deposit {
    public LongTermDeposit() {

    }


    @Override
    void deptor() {

    }

    @Override
    void creditor() {

    }

    @Override
    void monthInterest() {
        double rate = 0.2;
        setDepositAmount(getDepositAmount() + (getDepositAmount() * rate / 12));

    }
}
