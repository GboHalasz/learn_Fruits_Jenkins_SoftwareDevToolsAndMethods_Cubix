package hu.cubix.fruitnamedisplay.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.cubix.fruitnamedisplay.service.FruitNamesService;

@Controller
@RequestMapping("/")
public class FruitsNameDisplayThymeleafController {

	@Autowired
	FruitNamesService fruitNamesService;

	private List<String> getFruits() {
		
		return fruitNamesService.getFruits();
		
	}

	@GetMapping

	public String home(Map<String, Object> model) {
		List<String> fruits = getFruits();
		model.put("fruits", fruits);
		return "index";
	}
}