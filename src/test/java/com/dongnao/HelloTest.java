package com.dongnao;
	
import org.junit.Test;

import com.dongnao.HelloDongnao;

import static junit.framework.Assert.*;
public class HelloTest {
	@Test
	public void testHello(){
		HelloDongnao hello = new HelloDongnao();
		String results = hello.sayHello("dongnnao");
		assertEquals("Hello dongnnao",results);	
	}
}