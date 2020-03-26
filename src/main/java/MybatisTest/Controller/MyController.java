package MybatisTest.Controller;

import MybatisTest.dao.PicDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    PicDOMapper picDOMapper;
    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        Object res = picDOMapper.selectByPrimaryKey("000456.jpg");
        return res;
    }
}
