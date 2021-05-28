package cn.itcast.cservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("cservice")
public class CServiceController {

    @GetMapping("/cservice")
    public String cservice() {
        return "C";
    }
}
