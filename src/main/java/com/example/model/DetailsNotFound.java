package com.example.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DetailsNotFound extends RuntimeException{
	
//	
//	DetailsNotFound(){
//		
//	}
	private static final long serialVersionUID = 1L;
	public DetailsNotFound(String message)
	{
		super(message);
		System.out.println(message);
		
	}
//	public DetailsNotFound(final Throwable cause) {
//        super(cause);
//    }

}
