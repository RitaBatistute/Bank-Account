package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {

        String number = "Account: " + getNumber();
        String holder = "Holder: " + getHolder();
        String balance = "Balance: $ " + getBalance();

        return number + "; " + holder + "; " + balance + ".";
    }
}