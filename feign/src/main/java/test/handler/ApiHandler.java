package test.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.ApiService.ApiService;

import javax.annotation.Resource;

/**
 * @author kuass
 * @create kuass-04-12-13:45
 */
@RestController
public class ApiHandler {
    @Resource
    private ApiService apiService;
    @RequestMapping
    public String index(){
        return apiService.index();
    }
}
