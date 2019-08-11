package spring.test.mybatis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.test.mybatis.domain.service.TestService;
import spring.test.mybatis.infrastructure.mapper.TasksMapper;
import spring.test.mybatis.infrastructure.model.Tasks;

import java.util.List;

/**
 * @author lh
 **/
@RestController
public class TestController {
    @Autowired
    TestService testService;

    @Autowired
    TasksMapper tasksMapper;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Tasks> test() {
        return tasksMapper.test();
    }

}
