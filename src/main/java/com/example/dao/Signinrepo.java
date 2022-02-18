package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.signin.Signin;
//@EnableJpaAuditing
//@EnableJpaRepositories
public interface Signinrepo extends JpaRepository<Signin, Integer> {

	   
//@Query("from signin where email=?1")
	List<Signin> findByEmail( String Email);

	
	

}
