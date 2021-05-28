package cn.itcast.aservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient("bservice")
public interface BServiceFeign {

    @GetMapping("/bservice")
    public String bservice();
}
