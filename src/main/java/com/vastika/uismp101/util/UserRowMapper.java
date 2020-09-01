package com.vastika.uismp101.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vastika.uismp101.model.User;

public class UserRowMapper  implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new UserExtractor().extractData(rs);
	}

}
