package hu.cubix.fruitnamedisplay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cubix.fruitnamedisplay.config.FruitsNameDisplayConfigurationProperties;

@Service
public class FruitNamesService {

	@Autowired
	private FruitsNameDisplayConfigurationProperties config;

	public List<String> getFruits() {
		List<String> fruitnames = config.getFruits().getFruitNames();
		return fruitnames;
	}
}
