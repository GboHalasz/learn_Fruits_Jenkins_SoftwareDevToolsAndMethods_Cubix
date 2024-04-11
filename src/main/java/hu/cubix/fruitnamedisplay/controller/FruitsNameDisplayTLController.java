package hu.cubix.fruitnamedisplay.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.cubix.fruitnamedisplay.service.FruitNamesService;

@Controller
@RequestMapping("/")
public class FruitsNameDisplayTLController {

	@Autowired
	FruitNamesService fruitNamesService;
	
	@GetMapping
	public String home(Map<String, Object> model) {
		model.put("fruits", fruitNamesService.getFruits());
		return "index";
	}
}
