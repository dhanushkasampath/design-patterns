package com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.controller;

import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.enums.EncodingPatternEnum;
import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.factory.EncryptionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final EncryptionFactory factory;

    public DemoController(EncryptionFactory factory) {
        this.factory = factory;
    }

    // http://localhost:8080/encrypt?encodingPatternEnum=SHA1
    @GetMapping("/encrypt")
    public void encryptWithEncoder(@RequestParam EncodingPatternEnum encodingPatternEnum){
        factory.findEncryptionType(encodingPatternEnum).encrypt("dhanushka");
    }
}
