package com.pakage;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount object = new SavingsAccount();

        object.setAccountNumber(123456);
        object.setHolderName("arjun");
        object.setAvailableBalance(10000);
        object.setStatus("active");
        object.setMobileBankingEnabled(true);
        object.setInterestRate(10);
        object.setModeOfOperation("jointOperation");
        object.setTotalBalance(object.getAvailableBalance());
        object.setOpeningDate("25-10-2300");
        object.deposit(100);
        object.withdraw(200);
        double balance = object.retriveBalance();
        object.display();
    }
}
