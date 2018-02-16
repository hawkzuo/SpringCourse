package edu.tamu.amos.spring.springbootproject.launch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SampleSpringBootWebApplication {

    private static final Logger LOGGER =  LoggerFactory.getLogger(SampleSpringBootWebApplication.class);

    // With Web-Dependencies, the server will start at default port 8080
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SampleSpringBootWebApplication.class, args);
//        for (String beanName: applicationContext.getBeanDefinitionNames()) {
//            LOGGER.info(beanName);
//        }

    }
}
