package com.rabbit.rabbitboot.topic;

import com.rabbit.rabbitboot.config.RmConst;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {

        String msg1 = "I am email mesaage msg======";

        System.out.println("TopicSender 发送 the 1st : " + msg1);

        this.rabbitTemplate.convertAndSend(RmConst.EXCHANGE_TOPIC, RmConst.RK_EMAIL, msg1);

        String msg2 = "I am user mesaages msg########";

        System.out.println("TopicSender 发送 the 2nd : " + msg2);

        this.rabbitTemplate.convertAndSend(RmConst.EXCHANGE_TOPIC, RmConst.RK_USER, msg2);

        String msg3 = "I am error mesaages msg";

        System.out.println("TopicSender 发送 the 3rd : " + msg3);

        this.rabbitTemplate.convertAndSend(RmConst.EXCHANGE_TOPIC, "errorkey", msg3);

    }

}
