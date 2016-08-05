package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {
	
	@RequestMapping(value = "/message/{message}", method = RequestMethod.GET)
    public ResponseEntity<Boolean> getMessage(@PathVariable String message) {
		System.out.println("YO Bitches... message is: "+message);
        return new ResponseEntity<>(Boolean.TRUE,HttpStatus.OK);
    }
}
