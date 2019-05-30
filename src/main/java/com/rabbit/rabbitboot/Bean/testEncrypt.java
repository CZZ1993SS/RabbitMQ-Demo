package com.rabbit.rabbitboot.Bean;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;

public class testEncrypt {

    public static void main(String[] args) {

        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();

        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");          // 加密的算法，这个算法是默认的

        config.setPassword("ljk");                        // 加密的密钥

        standardPBEStringEncryptor.setConfig(config);

        /*这里是明文地址*/
        String plainText = "ffcsbapd";

        String encryptedText = standardPBEStringEncryptor.encrypt(plainText);

        System.out.println(encryptedText);

    }


}
