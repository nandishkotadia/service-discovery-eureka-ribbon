package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @Autowired
    private LoadBalancedClient pongClient;

    @RequestMapping(value="/message/{message}", method = RequestMethod.GET)
    @ResponseBody
    public Boolean sendMessage(@PathVariable String message) {
    	return this.pongClient.sendMessage(message);
    }
}
