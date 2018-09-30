# spring-cloud-microservices-development
启动顺序
1.服务中心 		 gjc-weather-eurake-server				8761
2.数据采集微服务 gjc-weather-collection-eureka-feign	8081
3.天气数据获取	 gjc-weather-data-eureka				8084
4.城市数据微服务 gjc-weather-city-eureka				8082
5.				gjc-weather-report-eureka-feign-getway-hystrix	8088
6.				gjc-weather-eurake-client-zuul					8087