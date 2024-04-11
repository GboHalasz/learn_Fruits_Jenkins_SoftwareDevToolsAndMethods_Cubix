package hu.cubix.fruitnamedisplay.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(FruitsNameDisplayTLController.class)
public class FruitsNameDisplayTLControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void getRequestToHomeShouldGiveBackTheIndexPageWithFruitList() throws Exception {
		this.mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"))
				.andExpect(model().attributeExists("fruits"))
				.andExpect(model().attribute("fruits", Matchers.hasItem("apple")));
	}
}