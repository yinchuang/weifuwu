package cn.itcast.bservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient("cservice")
public interface CServiceFeign {

    @GetMapping("/cservice")
    public String cservice();
}
