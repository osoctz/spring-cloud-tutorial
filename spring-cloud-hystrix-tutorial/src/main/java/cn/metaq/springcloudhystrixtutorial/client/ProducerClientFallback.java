package cn.metaq.springcloudhystrixtutorial.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ProducerClientFallback implements ProducerClient{

    private static Logger logger= LogManager.getLogger(ProducerClientFallback.class);

    @Override
    public String hello() {

        logger.error("can't get response by hello method");
        return "error";
    }
}
