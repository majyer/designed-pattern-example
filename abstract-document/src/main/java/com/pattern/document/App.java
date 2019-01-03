package com.pattern.document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public App() {
    	 LOGGER.info("Constructing parts and car");

    Map<String, Object> carProperties = new HashMap<>();
    carProperties.put(HasModel.PROPERTY, "300SL");
    carProperties.put(HasPrice.PROPERTY, 10000L);
    }
     public static void main(String[] args) {
    new App();
  }
}
