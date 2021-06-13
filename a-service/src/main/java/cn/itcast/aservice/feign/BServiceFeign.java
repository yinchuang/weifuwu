package cn.itcast.aservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import java.util.Map;


@FeignClient(value = "bservice")
public interface BServiceFeign {

    @GetMapping("/bservice")
    public String bservice(@RequestHeader Map<String, String> headers);
}
