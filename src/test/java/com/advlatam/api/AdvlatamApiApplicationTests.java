package com.advlatam.api;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest // tells Spring Boot to look for a main configuration class (one with @SpringBootApplication, for instance)
@AutoConfigureMockMvc
class AdvlatamApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnNotFoundAtRoot() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isNotFound());
	}

}
