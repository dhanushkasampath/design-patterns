package com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.encrypt;

import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class MD5Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encrypting using MD5 encryption method");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.MD5;
    }
}
