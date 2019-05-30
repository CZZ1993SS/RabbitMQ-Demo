package com.rabbit.rabbitboot.fanout;

import com.rabbit.rabbitboot.config.RmConst;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String msg) {

        String sendMsg = msg + "---" + System.currentTimeMillis();

        System.out.println("FanoutSender 开始发送消息: " + sendMsg);

        this.rabbitTemplate.convertAndSend(RmConst.EXCHANGE_FANOUT, "",sendMsg);

    }

}

