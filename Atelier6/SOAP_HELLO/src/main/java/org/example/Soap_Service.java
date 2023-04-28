package org.example;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Soap_Service {
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
