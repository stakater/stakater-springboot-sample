package io.aurorasolutions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StakaterDemoApplicationTests {

	@Autowired
	Service service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testService() {
		assertTrue(service.test().equalsIgnoreCase("This is a test String"));
	}
}
