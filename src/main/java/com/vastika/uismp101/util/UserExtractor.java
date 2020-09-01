package com.vastika.uismp101.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vastika.uismp101.model.Address;
import com.vastika.uismp101.model.User;

public class UserExtractor implements ResultSetExtractor<User>{

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setDob(rs.getDate("dob"));
		user.setGender(rs.getString("gender"));
		user.setEducationlevel(rs.getString("education_level"));
		
		Address address = new Address();
		address.setCity(rs.getString("city"));
		address.setCountry(rs.getString("country"));
		user.setAddress(address);
		return user;
	}

}
