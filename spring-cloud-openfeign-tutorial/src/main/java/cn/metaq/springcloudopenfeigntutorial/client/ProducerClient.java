package cn.metaq.springcloudopenfeigntutorial.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-producer")
public interface ProducerClient {

    @GetMapping("producer")
    public String hello();
}
