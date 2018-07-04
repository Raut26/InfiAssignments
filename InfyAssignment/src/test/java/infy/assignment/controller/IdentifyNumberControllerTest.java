package infy.assignment.controller;


import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import infy.assignment.controller.IdentifyNumberController;
import infy.assignment.model.Listmodel;
import infy.assignment.service.IdentifyNumberService;

/**
 * Test case for IdentifyNumberController
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)


public class IdentifyNumberControllerTest {
	
	
	
	@Mock
	private IdentifyNumberService service;
	
	@InjectMocks
	private IdentifyNumberController fc;
	
	@Test()
	public void testGet() throws IOException 
	{
		Listmodel list=new Listmodel();
		list.setList("10,20,30,4g");
		Assert.assertNotNull(fc.get(list));
	
	  }
	

	
}
