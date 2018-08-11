package cn.gjc.weather.initializrstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
public class InitializrStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitializrStartApplication.class, args);
	}
}
