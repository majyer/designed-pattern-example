package com.pattern.document.domain;
import java.util.Optional;
import com.pattern.document.Document;
public interface HasModel extends Document {
	String PROPERTY="model";
	default Optional<String> getModel() {
		return Optional.ofNullable((String) get(PROPERTY));
	}
}
