package cn.metaq.springcloudopenfeigntutorial.controller;

import cn.metaq.springcloudopenfeigntutorial.client.ProducerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TutorialController {

    @Resource
    private ProducerClient client;

    @GetMapping("hello")
    public String hello() {

        return client.hello() + " -> hello";
    }
}
