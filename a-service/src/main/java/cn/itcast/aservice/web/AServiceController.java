package cn.itcast.aservice.web;

import cn.itcast.aservice.feign.BServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aservice")
public class AServiceController {

    @Autowired
    BServiceFeign bServiceFeign;

    @GetMapping("/aservice")
    public String aservice(){
        String bResult = bServiceFeign.bserivce();
        return "A--> " + bResult;
    }

}
