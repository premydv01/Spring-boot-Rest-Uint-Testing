package com.pky.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class) // with junit 5 @Runwith(SpringRunner.class) is not working
@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void generateWelcomeMsgTest() throws Exception{
		
		MockHttpServletRequestBuilder getReq=MockMvcRequestBuilders.get("/welcome/prem");
		
		MvcResult result= mockMvc.perform(getReq).andReturn();
		
		MockHttpServletResponse response=result.getResponse();
		System.out.println("Response :"+response.getContentAsString());
		int statusCode=response.getStatus();
		
		assertEquals(200, statusCode);
	}
}
