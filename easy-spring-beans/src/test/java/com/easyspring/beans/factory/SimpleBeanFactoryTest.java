package com.easyspring.beans.factory;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleBeanFactoryTest {

    @Test
    public void testGetBean() throws Exception {
        SimpleBeanFactory beanFactory = new SimpleBeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}