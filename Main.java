package com.netcracker.ex1;

import java.sql.SQLException;

public class Main {
	public static void main(String args[]) throws SQLException
	{
		CustomService csobj = new CustomService();
		Customer customer = new Customer();
		customer.setId(5);
		customer.setName("Monika");
		customer.setCity("Pune");
		if(csobj.addNewCustomer(customer))
		{
			System.out.println("1 record inserted:)");
		}
		
		for(Customer cust:csobj.getAllCustomers("Pune"))
		{
			System.out.println(cust);
		}
	}
}
