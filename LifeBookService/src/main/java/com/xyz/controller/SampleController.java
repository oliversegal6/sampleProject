package com.xyz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xyz.Pojo.Node;
import com.xyz.com.xyz.service.BookService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SampleController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    //@Value("${spring.profiles}")
    private BookService bookService;

    @GetMapping("/nodes")
    @ApiOperation(value="getUserById", notes="根据id的id来获取用户详细信息")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "String", paramType = "path")
    public List<Node> getBookTree(String userId){
        logger.info("getBookTree start...");
        return bookService.getBookTree(userId);
    }

}
