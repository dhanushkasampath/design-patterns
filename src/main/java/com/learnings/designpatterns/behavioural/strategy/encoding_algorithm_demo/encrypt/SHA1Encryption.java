package com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.encrypt;

import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SHA1Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encrypting using SHA1 encryption method");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA1;
    }
}
