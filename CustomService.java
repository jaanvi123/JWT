package com.netcracker.ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomService {

	public boolean addNewCustomer(Customer customer)
	{
		boolean result = false;
		String sql = "insert into customers values(?,?,?)";
		Connection connection = ConnectionUtil.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, customer.getId());
			pst.setString(2, customer.getName());
			pst.setString(3, customer.getCity());
			
			int count = pst.executeUpdate();
			if(count > 0)
				result = true;
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public List<Customer> getAllCustomers(String city) throws SQLException
	{			String sql = "select * from customers where city = ?";
				
				List<Customer> customers = new ArrayList<>();
				
				try(Connection connection = ConnectionUtil.getConnection();
						PreparedStatement	pst = connection.prepareStatement(sql)) 
				{
					
					pst.setString(1, city);
					ResultSet rs = pst.executeQuery();
					while (rs.next())
					{
						//create one customer object per row
						Customer customer = new Customer();
						customer.setId(rs.getInt("id"));
						customer.setName(rs.getString("name"));
						customer.setCity(rs.getString("city"));
						//add that customer object into collection
						customers.add(customer);
					 }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return customers;
	}
}
