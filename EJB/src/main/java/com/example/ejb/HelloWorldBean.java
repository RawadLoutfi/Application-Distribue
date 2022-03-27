package com.example.ejb;
import javax.ejb.*;

@Stateless
public class HelloWorldBean implements HelloWorld{
    @Override
    public String sayHello() {
        return "Mme Rima !!!";
    }

}
