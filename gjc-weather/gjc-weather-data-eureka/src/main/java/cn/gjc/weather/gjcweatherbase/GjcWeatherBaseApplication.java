package cn.gjc.weather.gjcweatherbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GjcWeatherBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GjcWeatherBaseApplication.class, args);
	}
}
