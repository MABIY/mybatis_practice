package spring.test.mybatis.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author lh
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses ={
        spring.test.mybatis.infrastructure.config.Components.class,
        spring.test.mybatis.domain.service.impl.Components.class,
        spring.test.mybatis.web.controller.Components.class
})
public class WebConfig {
}