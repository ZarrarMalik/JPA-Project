package com.zarrar.myself.jpa.Jpaproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaProjectApplicationTests {

	@Test
	public void contextLoads() {
		int a =1;
		int b=2;
		assertEquals(3, a+b);
	}

}
