package task4.Problem3;

public class BankDetails {
    public static void main(String[] args) {

        BankAccount bk = new BankAccount();
        bk.getAccountNumber();
        bk.setDeposite(700f);
        float b2= bk.setWithdraw(500f);
        bk.checkBalance(b2);
    }
}