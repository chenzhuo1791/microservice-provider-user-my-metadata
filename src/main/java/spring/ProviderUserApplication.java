package spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("spring.dao")
@EnableDiscoveryClient
public class ProviderUserApplication {


	public static void main(String[] args){
		SpringApplication.run(ProviderUserApplication.class, args);
	}

}
