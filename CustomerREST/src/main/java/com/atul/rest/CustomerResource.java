package com.atul.rest;


import javax.ws.rs.*;

import com.atul.dao.CustomerDAO;
import com.atul.models.Customer;

@Path("/customers")
public class CustomerResource {

	/*
	 * JSON Binding to a Java Object 
	 * 1. Class is part of a non default package
	 * 2. Getters and setters and constructor
	 * 3. Model class is POJO
	 * 4. Member variables of model are private and Camel case.
	 * 5. Class Name is in TitleCase
	 */
	/*
	@GET @Produces("application/json")
	public Customer find() {
		Customer customer = new Customer();
		customer.setFirstName("Atul");
		customer.setLastName("Tiwari");
		return customer;
	}
	@POST @Consumes("application/json")
	public String create(Customer customer) {
		System.out.println("Processing new customer : "+customer.getLastName()+" "+customer.getFirstName());
		return "Added Successfuly !";
	}
	
	@PUT @Consumes("application/json")
	public String update(Customer customer) {
		System.out.println("Processing new customer : "+customer.getLastName()+" "+customer.getFirstName());
		return "Successfully Updated ";
	}
	*/
	
private CustomerDAO dao = CustomerDAO.getInstance();
	
	@GET @Produces({"application/json","application/xml"})
	public Customer find(@QueryParam("custId") Integer custId ) {
		Customer customer = dao.findById(custId);
		return customer;
	}
	
	@POST @Consumes("application/json")
	public String create(Customer customer) {
		System.out.println("Processing new customer : "+customer.getLastName()+" "+customer.getFirstName());
		dao.create(customer);
		return "Added Successfuly !";
	}
	
	@PUT @Consumes("application/json")
	public String update(Customer customer) {
		System.out.println("Processing new customer : "+customer.getLastName()+" "+customer.getFirstName());
		dao.update(customer);
		return "Successfully Updated ";
	}
}

