package com.pattern.document.domain;
import java.util.Optional;
import com.pattern.document.AbstractDocument;
public interface HasModel {
	string PROPERTY="model";
	default Optional<String> getModel(){
		return Optional.ofNullable((String)get(PROPERTY));
	}
}
