package test.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kuass
 * @create kuass-04-11-17:14
 */
@RestController
public class HelloWord {
    @Value("${server.oprt}")
    private int port;

    @RequestMapping("index")
    public String index(){
        return "hello world    端口是"+port;
    }
}


















