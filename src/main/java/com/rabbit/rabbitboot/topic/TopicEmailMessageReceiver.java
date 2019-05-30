package com.rabbit.rabbitboot.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "sb.info.email")
public class TopicEmailMessageReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("TopicEmailMessageReceiver  收到消息->: " +msg);
    }

}
