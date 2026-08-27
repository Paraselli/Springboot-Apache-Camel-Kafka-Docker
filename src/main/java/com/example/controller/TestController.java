package com.example.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    private final ProducerTemplate template;

    @Value("${kafka.broker:localhost:9092}")
    private String kafkaBroker;

    public TestController(ProducerTemplate template) {
        this.template = template;
    }

    @GetMapping("/api/send")
    public String send(@RequestParam(defaultValue = "Hello Kafka") String message) {
        template.sendBody("kafka:test-topic?brokers=" + kafkaBroker, message);
        return "Message sent to Kafka: " + message;
    }

    @GetMapping("/test")
    public String test() {
        return send("Test message from /test endpoint");
    }
}
