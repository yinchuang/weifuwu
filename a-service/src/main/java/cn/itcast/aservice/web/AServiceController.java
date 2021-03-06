package cn.itcast.aservice.web;

import cn.itcast.aservice.feign.BServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
public class AServiceController {

    @Autowired
    BServiceFeign bServiceFeign;

    @GetMapping("/aservice")
    public String aservice(@RequestHeader("version") String version){
        String bResult = bServiceFeign.bservice(version);
        return "A--> " + bResult;
    }

}
