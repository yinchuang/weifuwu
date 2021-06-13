package cn.itcast.bservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import java.util.Map;


@FeignClient("cservice")
public interface CServiceFeign {

    @GetMapping("/cservice")
    public String cservice(@RequestHeader Map<String, String> headers);
}
