package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Register;

public class registerMapper implements RowMapper<Register> {

	@Override
	public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Register r=new Register(rs.getInt("id"), rs.getString("userName"), rs.getString("password"), rs.getString("confirmPassword"), rs.getString("Email"),rs.getString("oldPassword"),rs.getString("newPassword"));
		return r;
	}

}
