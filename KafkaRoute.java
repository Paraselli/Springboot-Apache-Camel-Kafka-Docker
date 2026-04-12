package com.example.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaRoute extends RouteBuilder {

    @Override
    public void configure() {

        onException(Exception.class)
            .handled(true)
            .log("Error occurred: ${exception.message}")
            .to("kafka:dlq-topic");

        from("kafka:test-topic?brokers=localhost:9092")
            .routeId("kafka-consumer")
            .log("Received: ${body}")
            .to("log:output");
    }
}
