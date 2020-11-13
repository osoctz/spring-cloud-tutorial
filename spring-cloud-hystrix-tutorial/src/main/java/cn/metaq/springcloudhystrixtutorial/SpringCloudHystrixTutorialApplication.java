package cn.metaq.springcloudhystrixtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
public class SpringCloudHystrixTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixTutorialApplication.class, args);
	}

}
