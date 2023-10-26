package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import com.web.model.Account;
import com.web.service.BankServiceImp;

@Controller
public class BankController {
	@Autowired
	private BankServiceImp service;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/newaccount")
	public String newaccountpage() {
		return"newaccount";
	}
@RequestMapping("/register")
public String openaccount(Account account,@RequestParam String password,@RequestParam String cpassword) {
	if(password.equals(cpassword)) {
		service.saveAccount(account);
		
		return "accountopend";	
	}
	else {
		return "errorpswd";
	}
	
}
@RequestMapping("/balance")
public String checkbalance() {
	return"balanceform";
}
@RequestMapping("/bal")
public String getaccount(ModelMap model,int accountno,@RequestParam String name,@RequestParam String password) {
	Account a=service.getAccount(accountno);
	model.put("bank", a);
	if(a.getName().equals(name) && a.getPassword().equals(password)) {
		if(a.getStatus()==1) {
			service.saveAccount(a);
			return "balancedetails";
		}
		else {
			return "closed";
		}
	}
	else {
		return "error";
	}
}
@RequestMapping("/deposit")
public String deposit() {
	return "depositform";
}
@RequestMapping("/depo")
public String depositAmount(ModelMap model,int accountno,@RequestParam String name,@RequestParam double balance,@RequestParam String password) {
	Account b=service.depositAmmount(accountno,balance);
	model.put("bank", b);
	if(b.getName().equals(name)&&b.getPassword().equals(password)) {
		if(b.getStatus()==1) {
		service.saveAccount(b);
		return"depositdetails";}
		else {
			return "closed";
		}
	}
	else {
		return "error";
	}
}
@RequestMapping("/withdraw")
public String withdraw() {
	return "withdrawform";
}
@RequestMapping("/withd")
public String withdeawAmount(ModelMap model,int accountno,@RequestParam String name,@RequestParam double balance,@RequestParam String password) {
	model.put("amt", balance);
	Account b=service.depositAmmount(accountno,balance);
	model.put("bank", b);
	if(b.getName().equals(name)&&b.getPassword().equals(password) ) {
		if(b.getStatus()==1) {
		service.saveAccount(b);
		return"withdrawdetails";}
		else {
			return "closed";
		}
	}
	else {
		return "error";
	}
}
@RequestMapping("/closeac")
public String closeacnt() {	
	return "closeform";
}
@RequestMapping("/close")
public String closeAccount(@RequestParam int accountno,@RequestParam String password) {
	Account c=service.closeAccount(accountno);
	if(c.getPassword().equals(password)) {
			service.saveAccount(c);
			return "closed";
	}
	else {
		return "error";
	}
}
@RequestMapping("/transfer")
public String transfer() {	
	return "transferform";
}
@RequestMapping("/trans")
public String transferAmount(@RequestParam int faccountno,@RequestParam String fname,@RequestParam String fpassword,
		@RequestParam int taccountno,@RequestParam String tname,@RequestParam double balance) {
	Account d=service.getAccount(faccountno);
	Account e=service.getAccount(taccountno);
	Account f=service.transferAmount(taccountno, balance, faccountno);
	
	if(d.getStatus()==1) {
	if(d.getName().equals(fname)&&d.getPassword().equals(fpassword)) {
	if(e.getStatus()==1) {
	if (e.getName().equals(tname)) {
		service.saveAccount(d);
		service.saveAccount(e);
		service.saveAccount(f);
		return"transfersuccess";
	}
	else 
	{
		return"error";
	}
	}
	else {
		return "closed";
	}
	}
	else {
		return"error";
	}
	}
	else {
		return"closed";
	}
	
}
@RequestMapping("/aboutus")
public String about() {	
	return "about";
}
@RequestMapping("/reopen")
public String reopen() {	
	return "reopen";
}
@RequestMapping("/ropen")
public String reopen(@RequestParam int accountno,@RequestParam String password,@RequestParam String name) {
	Account c=service.reOpenAccount(accountno);
	if(c.getPassword().equals(password)&&c.getName().equals(name)) {
		
			service.saveAccount(c);
			return "reopendetails";
	}
	else {
		return "error";
	}
}
}
