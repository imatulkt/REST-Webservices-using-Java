package com.atul.dao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.atul.models.Account;

public class AccountDAO {
private static AccountDAO instance = new AccountDAO();
	
	private AccountDAO() { }
	
	public static AccountDAO getInstance() {
		return instance;
	}
	
	List<Account> accounts = new ArrayList<>();
	public Account findById(int num) {
		java.util.Optional<Account> acc = accounts.stream().filter(c -> c.getNum() == num).findFirst();
		if(acc.isPresent())
			return acc.get();
		else return null;
	}
	
	public List<Account> findAll(){
		//Create Un-modifiable list 
		return Collections.unmodifiableList(accounts);
	}
	
	public boolean deleteById(int num) {
		Account account = findById(num);
		if(account != null ) {
			accounts.remove(account);
			return true;
		}
		return false;
	}
	

	public boolean create(Account account) {
		Account temp = findById(account.getNum());
		if(temp != null) {
			return false;
		}
		accounts.add(account);
		return true;
	}

	

}
