package spring.test.mybatis.domain.service;

import spring.test.mybatis.infrastructure.model.Tasks;

/**
 * The interface Test service.
 *
 * @author lh
 */
public interface TestService {
    /**
     * Find all task tasks.
     *
     * @return the tasks
     */
    Tasks findAllTask(Integer id);
}
