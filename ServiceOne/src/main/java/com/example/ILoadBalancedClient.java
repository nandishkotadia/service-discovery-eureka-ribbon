package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ribbon-client")
public interface ILoadBalancedClient {

	public Boolean sendMessage(String message);
}
