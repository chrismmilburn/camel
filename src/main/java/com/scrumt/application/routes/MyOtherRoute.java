package com.scrumt.application.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyOtherRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C://inputFolder2?noop=true")
            .choice()
                .when( header("someConstant" ).isGreaterThan( 0) )
                    .log("found some constant")
                .endChoice()
                .when( header("someConstant" ).isGreaterThan( 0) )
                .log("found some constant")
                .endChoice()
                .otherwise()
                    .log("found NO constant")
                .endChoice()
            .end()
        .to("file:C://outputFolder");
    }
}
