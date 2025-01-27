
class Account {

    private int accNo;
    private String name;
    private String address;
    private String phoneNo;

    public Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }

    public int getAccountNumber() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String s) {
        this.address = s;
    }

    public String getPhoneNumber() {
        return phoneNo;
    }

    public void setPhoneNo(String x) {
        this.phoneNo = x;
    }

}

class SavingsAccount extends Account {

    private double interestRate;
    private double balance;

    public SavingsAccount(int accNo, String name, double interestRate) {
        super(accNo, name);
        this.interestRate = interestRate;
        this.balance = 0.0;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void SetInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getBal() {
        return balance;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    public void addInterest() {
        balance += balance * (interestRate / 100);
    }
}

class LoanAccount extends SavingsAccount {

    private double loanAmount;
    private double interestRate;

    public LoanAccount(int accNo, String name, double loanAmount, double interestRate) {
        super(accNo, name, interestRate);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void payEMI(double amount) {
        if (amount > 0 && amount <= loanAmount) {
            loanAmount -= amount;
        } else {
            System.out.println("Invalid EMI amount.");
        }
    }

    @Override
    public void addInterest() {
        loanAmount += loanAmount * (interestRate / 100);
    }
}

public class AccountTest {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "knee Grow", 2.5);
        sa.Deposit(10000);
        sa.addInterest();
        System.out.println("Savings Account Balance: " + sa.getBal());

        LoanAccount la = new LoanAccount(102, "shreyas Nayak", 8000.92, 5);
        la.payEMI(1000);
        la.addInterest();
        System.out.println("Remaining Loan Amount: " + la.getLoanAmount());
    }
}
