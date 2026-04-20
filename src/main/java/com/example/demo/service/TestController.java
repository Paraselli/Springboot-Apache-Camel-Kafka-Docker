package com.example.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    private final ProducerTemplate template;

    public TestController(ProducerTemplate template) {
        this.template = template;
    }

    @GetMapping("/send")
    public String send() {
        template.sendBody("kafka:test-topic?brokers=localhost:9092", "Hello Kafka");
        return "Message sent to Kafka";
    }
}
