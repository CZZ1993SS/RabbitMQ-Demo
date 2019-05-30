package com.rabbit.rabbitboot.Bean;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;

public class testDecrypt {

    public static void main(String[] args) {

        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();

        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");

        config.setPassword("ljk");

        standardPBEStringEncryptor.setConfig(config);

        String encryptedText = "YCHSZOCEv2Gl6XnJkJVK7uYf9Dn0pcAy";

        String plainText = standardPBEStringEncryptor.decrypt(encryptedText);

        System.out.println(plainText);

    }
}
