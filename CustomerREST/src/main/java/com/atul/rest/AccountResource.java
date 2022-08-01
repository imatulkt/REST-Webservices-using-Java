package com.atul.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.atul.dao.AccountDAO;
import com.atul.models.Account;

public class AccountResource {
	
	private AccountDAO dao = AccountDAO.getInstance();
	
	
	@POST @Consumes("application/json")
	public String create(Account account) {
		System.out.println("Processing new account : "+account.getNum()+" "+account.getHolderName());
		dao.create(account);
		return "Added Successfuly !";
	}
	
	
	@GET @Produces({"application/json"})
	public Account find(@QueryParam("num") Integer num ) {
		Account account = dao.findById(num);
		return account;
	}
	
	@DELETE
	public String delete(@QueryParam("num") Integer num) {
		dao.deleteById(num);
		return "Deleted Successfully!";
	}

}
