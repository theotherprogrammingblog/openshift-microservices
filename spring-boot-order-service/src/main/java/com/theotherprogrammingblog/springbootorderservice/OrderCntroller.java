package com.theotherprogrammingblog.springbootorderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderCntroller {

    @GetMapping("/hello-world/{name}")
    public String getHelloWorld (@PathVariable String name)
    {
        return "OrderControler says:  Hello World "+name;
    }



    @GetMapping("/hello")
    public String getHello ()
    {
        return "OrderControler says: Hello ";
    }

    @GetMapping("/")
    public String helloWorld ()
    {
        return "OrderControler says:  Hello ";
    }
}
