package com.genmymodel.shoppingcart;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @generated
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class LineItemControllerTest {

	private MockMvc mvc;

    /**
     * @generated
     */
	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new LineItemController()).build();
	}

    /**
     * @generated
     */
	@Test
	public void getHello() throws Exception {
	   
		mvc.perform(MockMvcRequestBuilders.get("/lineitem").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(is("Greetings from LineItemController!")));
		
		// Start of user code LineItem
		mvc.perform(MockMvcRequestBuilders.get("/lineitem").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(is("Greetings from LineItemController!")));
		
		// End of user code
	}
}
