package hu.cubix.fruitnamedisplay.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "fnd")
@Component
public class FruitsNameDisplayConfigurationProperties {

	private Fruits fruits = new Fruits();

	public Fruits getFruits() {
		return fruits;
	}

	public void setFruits(Fruits fruits) {
		this.fruits = fruits;
	}

	public static class Fruits {
		private List<String> fruitNames;

		public List<String> getFruitNames() {
			return fruitNames;
		}

		public void setFruitNames(List<String> fruitNames) {
			this.fruitNames = fruitNames;
		}

	}
}
