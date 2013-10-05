package spring.pointcuts.service.impl;

import spring.pointcuts.service.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name.toUpperCase();
    }
}
