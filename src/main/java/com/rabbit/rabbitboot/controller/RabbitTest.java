package com.rabbit.rabbitboot.controller;

import com.rabbit.rabbitboot.fanout.FanoutSender;
import com.rabbit.rabbitboot.hello.DefaultSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rabbit.rabbitboot.topic.TopicSender;

@RestController
@RequestMapping("/rabbit")
public class RabbitTest {

    @Autowired
    private DefaultSender defaultSender;

    @Autowired
    private TopicSender topicSender;

    @Autowired
    private FanoutSender fanoutSender;


    /**
     * 普通类型测试
     */
    @GetMapping("/send")
    public void hello() {

        defaultSender.send("hellomsg!");

    }

    /**
     * topic exchange类型rabbitmq测试
     */
    @GetMapping("/topicTest")
    public void topicTest() {

        topicSender.send();

    }

    /**
     * fanout exchange类型rabbitmq测试
     */
    @GetMapping("/fanoutTest")
    public void fanoutTest() {
        fanoutSender.send("hellomsg:OK");
    }

}
