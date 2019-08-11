package spring.test.mybatis.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.test.mybatis.domain.service.TestService;
import spring.test.mybatis.infrastructure.mapper.TasksMapper;
import spring.test.mybatis.infrastructure.model.Tasks;

/**
 * @author lh
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TasksMapper tasksMapper;

    public Tasks findAllTask(Integer id) {
        return tasksMapper.selectByPrimaryKey(id);
    }
}
