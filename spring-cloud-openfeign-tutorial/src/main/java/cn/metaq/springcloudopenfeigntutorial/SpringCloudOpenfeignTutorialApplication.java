package cn.metaq.springcloudopenfeigntutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient //启用服务发现
@EnableFeignClients
@SpringBootApplication
public class SpringCloudOpenfeignTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOpenfeignTutorialApplication.class, args);
	}

}
