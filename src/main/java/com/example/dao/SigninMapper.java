package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.signin.Signin;

public class SigninMapper implements RowMapper<Signin> {

	@Override
	public Signin  mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Signin s=new Signin(rs.getInt("id"),rs.getString("Email"),rs.getString("password"));
		return s;
	}

}
