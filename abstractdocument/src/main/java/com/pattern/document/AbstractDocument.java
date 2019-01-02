package com.pattern.document;
import java.util.List;

public class AbstractDocument {
	private final Map<String,Object> properties;

	protected AbstractDocument(Map<String,Object> properties){
		Object.requireNonNull(properties,"properties map is required");
		this.properties =properties;
	}
}
