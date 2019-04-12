package test.ApiService;

import org.springframework.stereotype.Component;

/**
 * @author kuass
 * @create kuass-04-12-13:42
 */
@Component
public class ApiserviceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障";
    }
}
