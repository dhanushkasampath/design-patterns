package com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.factory;

import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.encrypt.Encryption;
import com.learnings.designpatterns.behavioural.strategy.encoding_algorithm_demo.enums.EncodingPatternEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class EncryptionFactory {

    Map<EncodingPatternEnum, Encryption> map;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionTypeSet){
        createStrategy(encryptionTypeSet);
    }

    private void createStrategy(Set<Encryption> encryptionTypeSet) {
        map = new HashMap<>();
        encryptionTypeSet.forEach(encryptionTypes ->
                map.put(encryptionTypes.getEncryptionType(), encryptionTypes));
    }

    public Encryption findEncryptionType(EncodingPatternEnum encodingPatternEnum){
        return map.get(encodingPatternEnum);
    }
}
