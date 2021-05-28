package cn.itcast.aservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AServiceApplication.class, args);
    }
}
