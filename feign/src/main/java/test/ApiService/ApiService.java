package test.ApiService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kuass
 * @create kuass-04-11-16:22
 */
@FeignClient(value = "eurekaclient",fallback = ApiserviceError.class)
public interface ApiService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
