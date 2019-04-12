package test.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kuass
 * @create kuass-04-07-16:20
 */
@RestController
public class HelloWorld {
    @RequestMapping("index")
    public String index(){
        return "jjjjj";
    }
}
