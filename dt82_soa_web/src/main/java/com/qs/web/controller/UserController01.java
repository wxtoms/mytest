package com.qs.web.controller;

import com.qs.javabean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
// http://localhost:8081/service/41
public class UserController01 {

    // 我们可以使用httpClient插件来模拟浏览器对服务器的访问，但是得到json串之后我们需要手动转换成User类，jackson工具就可以完成
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;


    // http://localhost:8080/findById?id=41
    @RequestMapping("findById")
    public User findById(int id) {

        List<ServiceInstance> instances = discoveryClient.getInstances("soa-server");
        ServiceInstance instance = instances.get(0);
        String host = instance.getHost();
        int port = instance.getPort();
        System.out.println("host: " + host);
        System.out.println("port: " + port);
        User user = restTemplate.getForObject("http://soa-server/service/" + id, User.class);
        System.out.println(user);

        return user;
    }

}

