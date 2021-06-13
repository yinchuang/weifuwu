package cn.itcast.bservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient("cservice")
public interface CServiceFeign {

    @GetMapping("/cservice")
    public String cservice(@RequestHeader Map<String, String> headers);
}
