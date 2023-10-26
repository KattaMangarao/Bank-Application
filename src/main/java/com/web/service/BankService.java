package com.web.service;

import com.web.model.Account;

public interface BankService {
	public Account saveAccount(Account account);
	public Account transferAmount(int taccountno,double balance,int faccountno);
	public Account depositAmmount(int accountno,double balance);
	public Account withdrawAmount(int accountno,double balance);
	public Account closeAccount(int accountno);
	public Account getAccount(int accountno);
	public Account reOpenAccount(int accountno);

}
