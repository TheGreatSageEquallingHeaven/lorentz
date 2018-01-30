package big.foot.boy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaoxuwang on 2018/1/30.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    @ResponseBody
    public String sayHi(){
        return "Hi,eureka. Port : " +port;
    }

}
