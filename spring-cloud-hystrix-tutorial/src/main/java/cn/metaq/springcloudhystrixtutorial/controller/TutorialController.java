package cn.metaq.springcloudhystrixtutorial.controller;

import cn.metaq.springcloudhystrixtutorial.client.ProducerClient;
import cn.metaq.springcloudhystrixtutorial.client.ProducerClientFallback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TutorialController {

    private static Logger logger= LogManager.getLogger(TutorialController.class);

    @Value("${test.key}")
    private String config_key;

    @Resource
    private ProducerClient client;

    @GetMapping("hello")
    public String hello() {
        logger.info("{}",config_key);
        return client.hello() + " -> hello";
    }
}
