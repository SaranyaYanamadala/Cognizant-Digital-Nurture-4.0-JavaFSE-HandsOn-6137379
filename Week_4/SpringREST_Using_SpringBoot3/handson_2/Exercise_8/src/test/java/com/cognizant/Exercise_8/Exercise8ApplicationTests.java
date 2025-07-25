package com.cognizant.Exercise_8;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.Exercise_8.controller.CountryController;

@AutoConfigureMockMvc 
@SpringBootTest
class Exercise8ApplicationTests {
	
	@Autowired
    private MockMvc mvc;
	
	@Autowired
    private CountryController countryController;

	@Test
    public void contextLoads() {
        assertNotNull(countryController);
    }
	
	@Test
    public void testGetCountry() throws Exception {
        ResultActions actions = mvc.perform(get("/country"));
        // checking if the status is 200
        actions.andExpect(status().isOk());
        // to check if the code is available in response 
        actions.andExpect(jsonPath("$.code").exists());
        // checking for code "IN"
        actions.andExpect(jsonPath("$.code").value("UK"));
        // checking for name attribute as well
        actions.andExpect(jsonPath("$.name").value("United Kingdom"));
    }
	
	@Test
	public void testGetCountry_NotFound() throws Exception {
	    mvc.perform(get("/countries/UK"))
	        .andExpect(status().isBadRequest())
	        .andExpect(status().reason("Country Not found"));
	}




}
