package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Signinrepo;
import com.example.dao.registerRepo;
import com.example.model.DetailsNotFound;
import com.example.model.Register;
import com.example.signin.passwordEx;

@RestController
@CrossOrigin(origins="*")
//@EnableJpaRepositories
public class MyController {
	
	@Autowired
	registerRepo repo;
	
	@Autowired
	Signinrepo repo1;
//	

	
//********************************************************************************************************************
	//              Register
	
	@PostMapping("/register")    
	public Register add(@RequestBody Register details)
	
	{
	//	System.out.println("san");
		System.out.println(details.getUserName());
		System.out.println(details.getEmail());
		System.out.println(details.getPassword());
		System.out.println(details.toString());		
		return repo.save(details);

	}
	
	@GetMapping("/reg")
	public List<Register> reg(){
		
//		List<Register> list=repo.findAll();
//		System.out.println(list);
		return (List<Register>)repo.findAll();
	}
	
	
	
	
	//***********************************************************************************************************************
	//                               signin
//	@Autowired
//	Register r;
	
	@PostMapping("/signin")    
	public Register add1(@RequestBody Register details)
	
	{
	
	
		System.out.println("in sign save method");
		System.out.println(details.getEmail());
		System.out.println(details.getPassword());
		System.out.println(details.toString());
		//repo1.save(details);
		 System.out.println(repo1.findByEmail(details.getEmail()));
		 System.out.println(repo.findByEmailPassword(details.getEmail() ,details.getPassword()));
	
		 if(repo.findByEmailPassword(details.getEmail() ,details.getPassword()) != null)
		 {
			 System.out.println("details are there");
		 }
		 else {
			 System.out.println("details are not exist");
		 }
//		 Register register=repo.findByEmailPassword(details.getEmail() ,details.getPassword())
//		            .orElseThrow(() -> new DetailsNotFound("User not found with id :" + userId));
//		          return ResponseEntity.ok(register);
		 System.out.println(repo.findByEmailPassword(details.getEmail(), details.getPassword()));
		return repo.findByEmailPassword(details.getEmail() ,details.getPassword());
	}
	
	  @GetMapping("byId/{id}")
	    public ResponseEntity<Register> getUserById(@PathVariable(value = "id") int userId) {
		  System.out.println(userId);
	     //   return repo.findById((int) userId)
		  Register register=repo.findById(userId)
	            .orElseThrow(() -> new DetailsNotFound("User not found with id :" + userId));
	          return ResponseEntity.ok(register);
	    }
	  //**********************************************************************************************
	  @DeleteMapping("/cancel/{id}")
	    public List<Register> cancelRegistration(@PathVariable int id) {
	        repo.deleteById(id);
	        System.out.println(id);
	        return repo.findAll();
	    }
	  
	  //***************************************************************************************************
	   @PutMapping("/update/{id}")
	    public ResponseEntity<Register> updateEmployee(@PathVariable(value = "id") Integer employeeId,  @RequestBody Register employeeDetails) throws DetailsNotFound {
	        Register employee = repo.findById(employeeId)
	                .orElseThrow(() -> new DetailsNotFound("Employee not found for this id :: " + employeeId));

	        employee.setUserName(employeeDetails.getUserName());
	        employee.setEmail(employeeDetails.getEmail());
	        employee.setPassword(employeeDetails.getPassword());
	    //    employee.setDepartment(employeeDetails.getDepartment());
           System.out.println("in put method");
	        final Register updatedEmployee = repo.save(employee);
	        return ResponseEntity.ok(updatedEmployee);
	    }
	   
	   //************************************************
	   
//	   @GetMapping("/update1/{id}/{oldPassword}/{newPassword}")
//	    public void updatePassword(@PathVariable(value = "id") Integer employeeId,@PathVariable(value = "newPassword") String newPassword,@PathVariable(value = "oldPassword") String oldPassword)  {
	@PutMapping("/pass/{id}")
	   public void updatePassword( @PathVariable(value="id")Integer eid, @RequestBody passwordEx p) {
	   System.out.println("pasword");
		
		//  Register details =new Register();
		  passwordEx pass=new passwordEx();
		  pass.setId(eid);
		  pass.setNewPassword(p.getNewPassword());
		  pass.setOldPassword(p.getOldPassword());
		  System.out.println(pass.getNewPassword());
		
		  System.out.println();
		     repo.findByPasswordEmail(pass.getNewPassword(), pass.getOldPassword(), pass.getId());
	       
	    }
//  @PutMapping("/pass")
//  public Register updatePassword( @RequestBody Register details) {
//	  System.out.println("Password update");
//
//		System.out.println(details.getOldPassword());
//		System.out.println(details.getNewPassword());
//		System.out.println( repo.findByPasswordEmail(details.getOldPassword(),details.getNewPassword(),details.getId()));
//		  return repo.findByPasswordEmail(details.getOldPassword(),details.getNewPassword(),details.getId());
//	  
//	  
//	  
//  }
}
