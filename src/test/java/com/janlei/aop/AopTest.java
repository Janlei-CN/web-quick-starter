package com.janlei.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop-config.xml")
public class AopTest {

    @Test
    public void test_before() {
        new Target().handle();
    }
//
//	@Test
//	public void test_after(){
//		Advice advice = new Advice();
//		Target target = new Target();
//		// 后置
//		target.handle();
//		advice.insertLog();
//	}
//
//	@Test
//	public void test_around(){
//		Advice advice = new Advice();
//		Target target = new Target();
//		// 环绕
//		advice.insertLog();
//		target.handle();
//		advice.insertLog();
//	}
}

