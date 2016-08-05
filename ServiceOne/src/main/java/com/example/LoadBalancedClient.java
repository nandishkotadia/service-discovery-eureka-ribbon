package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class LoadBalancedClient implements ILoadBalancedClient{

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;
    
    @Override
    public Boolean sendMessage(String message) {
        Boolean response =  this.restTemplate.getForObject("http://ServiceTwo/message/"+message, Boolean.class);
        return response;
    }

}
