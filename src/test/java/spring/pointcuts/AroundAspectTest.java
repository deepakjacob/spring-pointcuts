package spring.pointcuts;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.pointcuts.service.SayHelloService;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration("/application-context-around-aspect.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AroundAspectTest {

    @Autowired
    private SayHelloService service;

    @Test
    public void testAroundAspect() {
        assertNotNull(service);
        String user = service.sayHello("user");
        assertNotNull(user);

    }
}
