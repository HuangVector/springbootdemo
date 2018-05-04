package cn.vector.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-5-4 15:17
 */
@RestController
public class HelloController {
   @Autowired
   private GirlProperties girlProperties;

    //content: "cupSize:${cupSize},age:${age}"
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }
}
