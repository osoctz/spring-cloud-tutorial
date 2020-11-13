package cn.metaq.springcloudhystrixtutorial.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-producer",fallback = ProducerClientFallback.class)
public interface ProducerClient {

    @GetMapping("producer")
    public String hello();
}
