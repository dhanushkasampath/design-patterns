package com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.encrypt;

import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.enums.EncodingPatternEnum;

public interface Encryption {

    void encrypt(String toBeEncrypted);
    EncodingPatternEnum getEncryptionType();
}
