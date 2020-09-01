package com.vastika.uismp101.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vastika.uismp101.model.User;
import com.vastika.uismp101.util.QueryUtil;
import com.vastika.uismp101.util.UserRowMapper;

public class UserInfoDaoImpl implements UserInfoDao {
	@Autowired
	private DataSource datasource;
	
	@Override
	public void saveUserInfo(User user) {
		
		getJdbcTemplate().update(QueryUtil.INSERT_INTO, new Object[] 
				{user.getFirstname(),user.getLastname(),user.getDob(),user.getGender(),user.getEducationlevel()});
	}


	@Override
	public List<User> displayAllUsers() {
		
		 List<User> userAllList=getJdbcTemplate().query(QueryUtil.DISPLAY_ALL, new UserRowMapper());
		 return userAllList;
	}


	@Override
	public User getUserById(int id) {
		List<User> userList=getJdbcTemplate().query(QueryUtil.DISPLAY_BY_ID, 
				new Object[] {id}, new UserRowMapper());
		return userList.get(0);
	}

	private JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(datasource);
	}
}
