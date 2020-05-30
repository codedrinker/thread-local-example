package com.devcuss;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public Integer test() {
        System.out.println(Thread.currentThread().getName() + " : " + SessionInterceptor.sl.get());
        return SessionInterceptor.sl.get();
    }
}
