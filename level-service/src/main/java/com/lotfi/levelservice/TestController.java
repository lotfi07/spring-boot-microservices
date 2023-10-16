package com.lotfi.levelservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api")
    public String getGreetings() {
      return "new microservices project";
    }
}
