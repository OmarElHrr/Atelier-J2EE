package org.example;

import javax.xml.ws.Endpoint;

public class Soap_endpoint {
    public static void main(String[] args) {
        System.out.println("The server now is running");
        Endpoint.publish("http://localhost:8080/hello", new Soap_Service());
    }
}
