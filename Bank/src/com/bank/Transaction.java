package com.bank;
import java.util.*;
public class Transaction {
	private long account_no;
	private String name;
	private int balance;

//	 public Transaction(long account_no,String name,int balance){
//    	super(account_no,name,balance);
//}
	 public Transaction(long account_no,String name,int balance)
	 {   this.account_no = account_no;
	 	this.balance = balance;
	 	this.name = name;
	 }
	 public long getAccount_no() {
	 	return account_no;
	 }
	 public void setAccount_no(long account_no) {
	 	this.account_no = account_no;
	 }
	 public String getName() {
	 	return name;
	 }
	 public void setName(String name) {
	 	this.name = name;
	 }
	 public int getBalance() {
	 	return balance;
	 }
	 public void setBalance(int balance) {
	 	this.balance = balance;
	 }
	 public int withdrawal(int amount)
	{   System.out.println(balance);
	    System.out.println(amount);
				if(balance>=amount)
		{	this.balance=this.balance-amount;
		System.out.println("Now you have :"+this.balance+" in your account.");
		}
				if( balance < amount)
				{     
					System.out.println("Transaction can't be processed due to low balance");
				}

		return this.balance;
	}
	
	public int deposit(int amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Now you have :"+this.balance+" in your account.");
		return this.balance;
	}
}
