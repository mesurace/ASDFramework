package com.asd.group1.framework.lib.account;

import java.util.ArrayList;
import java.util.List;

import com.asd.group1.framework.lib.customer.ACustomer;
import com.asd.group1.framework.lib.customer.ICustomer;
import com.asd.group1.framework.lib.transaction.ITransaction;

/**
 *
 * @author Manish Karki
 */
public abstract class AAcount implements IAccount{

	private String accountNumber;
	private double balance;
	private List<ITransaction> transactions;
	private ICustomer iCustomer;
	
	public String getAccounttNumber() {
        return accountNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.accountNumber = acctNumber;
    }

    public List<ITransaction> getTransactions() {
        return transactions;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void addTransaction(ITransaction transaction) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(transaction);
    }

    @Override
    public double getCurrentBalance() {
        return this.balance;
    }

    public void updateAmountByTransaction(ITransaction transaction) {
        this.balance += transaction.getSignedAmount();
    }

    @Override
    public ICustomer getCustomer() {
        return iCustomer;
    }

    @Override
    public void setCustomer(ICustomer iCustomer) {
        this.iCustomer = iCustomer;
    }

    @Override
    public String generateReport() {

        String ret = "";
        return ret;
    }

    @Override
    public String toString() {
        return "AAccount{" + "acctNumber=" + accountNumber + ", balance=" + balance + '}';
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return ((ACustomer)iCustomer).getName();
    }

    public String getCity() {
        return ((ACustomer) iCustomer).getCity();
    }

}

