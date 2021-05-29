package cn.itcast.bservice.web;

import cn.itcast.bservice.feign.CServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("bservice")
public class BServiceController {

    @Autowired
    private CServiceFeign cServiceFeign;

    @GetMapping("/bservice")
    public String bservice() {
        String cResult = cServiceFeign.cservice();
        return "B--> " + cResult;
    }
}
