package com.example.greetings.greetings.Controller;

import com.example.greetings.greetings.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreatingsController {

    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetings")
    public Greetings greatings (@RequestParam (value = "name", defaultValue = "World") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }
}
