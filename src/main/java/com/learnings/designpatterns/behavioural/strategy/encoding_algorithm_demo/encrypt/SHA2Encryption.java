package com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.encrypt;

import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SHA2Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encrypting using SHA2 encryption method");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA2;
    }
}
