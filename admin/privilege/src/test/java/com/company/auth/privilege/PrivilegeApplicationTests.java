package com.company.auth.privilege;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.company.auth.privilege.repositories.PrivilegeRepository;

//@RunWith(SpringRunner.class)//Note that SpringRunner extends SpringJUnit4ClassRunner
//@SpringBootTest
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@WebMvcTest
public class PrivilegeApplicationTests {

//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	PrivilegeRepository privilegeRepository;
//
//	@Test
//	public void contextLoads() throws Exception {
//		Mockito.when(privilegeRepository.findAll()).thenReturn(Collections.emptyList());
//
//		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/privileges")
//				.accept(MediaType.APPLICATION_JSON)
//				).andReturn();
//
//		System.out.println(mvcResult);
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/privileges"))
//		.andExpect(MockMvcResultMatchers.status().isOk());
//
//		//assertThat(0, is(1));
//		
//		Mockito.verify(privilegeRepository).findAll();
//	}
	
	@Test
	public void testExample1() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testExample2() throws Exception {
		assertEquals(2, Arrays.asList("a","b").size());
	}
}

