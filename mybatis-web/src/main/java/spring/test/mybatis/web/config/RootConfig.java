package spring.test.mybatis.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lh
 **/
@Configuration
@ComponentScan(basePackageClasses = {
        spring.test.mybatis.domain.service.impl.Components.class,
        spring.test.mybatis.infrastructure.config.Components.class
})
public class RootConfig {
}
