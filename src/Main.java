public class Main {
    public static void main(String[] args) {
        ShortTermDeposit a = new ShortTermDeposit();
        a.setDepositAmount(3000);
        a.setAmount(2000);
        System.out.println(a.getDepositAmount());
        a.deptor();
        System.out.println(a.getDepositAmount());
        a.creditor();
        System.out.println(a.getDepositAmount());
        a.monthInterest();
        System.out.println(a.getDepositAmount());

        LongTermDeposit b = new LongTermDeposit();
        b.setDepositAmount(1000000);
        b.setAmount(500000);
        System.out.println(b.getDepositAmount());
        b.deptor();
        System.out.println(b.getDepositAmount());
        b.creditor();
        System.out.println(b.getDepositAmount());
        b.monthInterest();
        System.out.println(b.getDepositAmount());

        StoredDeposit c = new StoredDeposit();
        c.setDepositAmount(5000000);
        c.setAmount(1000000);
        System.out.println(c.getDepositAmount());
        c.deptor();
        System.out.println(c.getDepositAmount());
        c.creditor();
        System.out.println(c.getDepositAmount());
        c.monthInterest();
        System.out.println(c.getDepositAmount());


    }
}
