package com.vastika.uismp101.util;

public class QueryUtil {
	
	public static final String INSERT_INTO="insert into user_info(firstname,lastname,dob, gender,city, country, education_level) values(?,?,?,?,?,?,?)";
	public static final String DISPLAY_ALL=" select * from user_info";
	public static final String DISPLAY_BY_ID="select * from user_info where id=?";

}
