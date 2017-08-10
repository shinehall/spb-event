package tech.chauncy.demo.spbevent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpbEventApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void contextLoads() {
		applicationContext.publishEvent(new SampleEvent(new Object(), "白日依山尽，黄河入海流"));
	}
}
