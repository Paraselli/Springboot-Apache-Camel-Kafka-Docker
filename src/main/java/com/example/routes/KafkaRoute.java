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
            .to("kafka:dlq-topic?brokers={{kafka.broker:localhost:9092}}");

        from("kafka:test-topic?brokers={{kafka.broker:localhost:9092}}")
            .routeId("kafka-consumer")
            .log("Received message from Kafka: ${body}")
            .to("log:output?showAll=true&multiline=true");
    }
}
