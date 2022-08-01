package com.atul.models;

public class Customer {
	/// Members in camelCase notation
		private String firstName, lastName;
		private Integer custid;
		
		//default constructor
		public Customer() {
			
		}

		public Integer getCustId() {
			return custid;
		}

		public void setCustId(Integer custid) {
			this.custid = custid;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
}
