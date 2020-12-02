package com.scrumt.application.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyOtherRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C://inputFolder2?noop=true").to("file:C://outputFolder");
    }
}
