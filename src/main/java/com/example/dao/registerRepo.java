package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Register;

public interface registerRepo extends JpaRepository<Register, Integer> {

//	public Register getRegister(int id);
	@Query(value="select * from register where email=?1 and password=?2",nativeQuery=true)
	Register findByEmailPassword(String email, String password);
	
	//password reset
	 @Transactional
	@Modifying
	@Query(value="update register set  password =?1 where password=?2 and id=?3",nativeQuery=true)
	void findByPasswordEmail(String newPassword,String oldPassword,Integer id);
}
