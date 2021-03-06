package cn.gjc.weather.initializrstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GjcDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GjcDiscoveryApplication.class, args);
	}
}
