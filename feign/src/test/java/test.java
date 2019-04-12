import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.ApiService.ApiService;

import javax.annotation.Resource;

/**
 * @author kuass
 * @create kuass-04-11-17:22
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
    @Resource
    private ApiService apiService;

    @org.junit.Test
    public void test1(){
        System.out.println(apiService.index());
    }
    @org.junit.Test
    public void test2(){
        System.out.println(apiService.index());
    }
    @org.junit.Test
    public void test3(){
        System.out.println(apiService.index());
    }
}


















