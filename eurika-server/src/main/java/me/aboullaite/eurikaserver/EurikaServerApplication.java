package me.aboullaite.eurikaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaServerApplication.class, args);
	}
}
