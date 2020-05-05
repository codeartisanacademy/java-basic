package com.company;

class BankAccount{
    private int accountNumber;
    private float minimumDeposit;
    private String owner;

    public void setAccountNumber(int _accountNumber){
        this.accountNumber = _accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setMinimumDeposit(float minimumDeposit) {
        if(minimumDeposit > 200000){
            this.minimumDeposit = minimumDeposit;
        }
    }

    public float getMinimumDeposit() {
        return this.minimumDeposit;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber(2312812);
        acc.setOwner("John");
        acc.setMinimumDeposit(200000);

        System.out.println(acc.getAccountNumber());
    }
}
