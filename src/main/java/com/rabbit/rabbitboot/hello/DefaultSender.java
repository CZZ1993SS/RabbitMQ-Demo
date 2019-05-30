package com.rabbit.rabbitboot.hello;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rabbit.rabbitboot.config.RmConst;


@Component
public class DefaultSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String msg) {

        String sendMsg = msg +"---"+ System.currentTimeMillis();

        System.out.println("发送者开始发送消息-> : " + sendMsg);

        this.rabbitTemplate.convertAndSend(RmConst.QUEUE_HELLO, sendMsg);

        this.rabbitTemplate.convertAndSend(RmConst.QUEUE_USER, sendMsg);

    }

}
