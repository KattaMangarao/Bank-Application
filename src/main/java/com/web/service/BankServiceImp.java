package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Account;
import com.web.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
@Autowired
private BankRepo repo;
	
	@Override
	public Account saveAccount(Account account) {

		return repo.save(account);
	}

	

	@Override
	public Account depositAmmount(int accountno, double balance) {
		Account a=repo.findById(accountno).get();
		double amt=0.0;
		amt=a.getBalance()+balance;
		a.setBalance(amt);
		return a;
	}

	@Override
	public Account withdrawAmount(int accountno, double balance) {
		Account a=repo.findById(accountno).get();
		double amt=0.0;
		if(a.getBalance()>balance)
		{
		amt=a.getBalance()-balance;
		a.setBalance(amt);}
		return a;	
		
	}

	@Override
	public Account closeAccount(int accountno) {
		Account acnt=repo.findById(accountno).get();
		int a=0;
		acnt.setStatus(a);
		
		return acnt;
	}

	@Override
	public Account getAccount(int accountno) {
		Account get=repo.findById(accountno).get();

		return get;
	}
	
	@Override
	public Account transferAmount(int taccountno, double balance, int faccountno) {
		Account a=repo.findById(faccountno).get();
		double amt=0.0;
		amt=a.getBalance()-balance;
		a.setBalance(amt);
		
		a=repo.findById(taccountno).get();
		double amount=0.0;
		amount=a.getBalance()+balance;
		a.setBalance(amount);
		return a;
	}
	@Override
	public Account reOpenAccount(int accountno) {
		Account acnt=repo.findById(accountno).get();
		int a=1;
		acnt.setStatus(a);
		
		return acnt;
	}
}
