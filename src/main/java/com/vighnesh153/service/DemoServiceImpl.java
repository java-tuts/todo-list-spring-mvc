package com.vighnesh153.service;

import org.springframework.stereotype.Service;

/* Service layer is the layer where we write the business logic
 */

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user + ".";
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo Application 153.";
    }
}
