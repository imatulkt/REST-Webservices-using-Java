package com.atul.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.el.stream.Optional;

import com.atul.models.Customer;

public class CustomerDAO {

	private static CustomerDAO instance = new CustomerDAO();
	
	private CustomerDAO() { }
	
	public static CustomerDAO getInstance() {
		return instance;
	}
	
	
	List<Customer> customers = new ArrayList<>();
	
	public Customer findById(int id) {
		java.util.Optional<Customer> cust = customers.stream().filter(c -> c.getCustId() == id).findFirst();
		if(cust.isPresent())
			return cust.get();
		else return null;
	}
	
	
	public List<Customer> findAll(){
		//Create Un-modifiable list 
		return Collections.unmodifiableList(customers);
	}
	
	public boolean deleteById(int id) {
		Customer customer = findById(id);
		if(customer != null ) {
			customers.remove(customer);
			return true;
		}
		return false;
	}
	
	public boolean update(Customer customer) {
		Customer temp = findById(customer.getCustId());
		if(temp == null) {
			return false;
		}
		temp.setFirstName(customer.getFirstName());
		temp.setLastName(customer.getLastName());
		return true;
	}
	
	public boolean update(int custId, String firstName) {
		Customer temp = findById(custId);
		if(temp == null)
			return false;
		
		temp.setFirstName(firstName);
		return true;
	}
	
	public boolean create(Customer customer) {
		Customer temp = findById(customer.getCustId());
		if(temp != null) {
			return false;
		}
		customers.add(customer);
		return true;
	}
}
