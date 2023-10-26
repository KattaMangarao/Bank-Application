package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
@Id
private int accountno;
private String name;
private String password;
private double balance;
private String address;
private int status;
public Account() {
	super();
}
public Account(int accountno, String name, String password, double balance, String address, int status) {
	super();
	this.accountno = accountno;
	this.name = name;
	this.password = password;
	this.balance = balance;
	this.address = address;
	this.status = status;
}
public int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return "Account [accountno=" + accountno + ", name=" + name + ", password=" + password + ", balance=" + balance
			+ ", address=" + address + ", status=" + status + "]";
}

}
