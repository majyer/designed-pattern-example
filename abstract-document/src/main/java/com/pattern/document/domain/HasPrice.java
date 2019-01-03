package com.pattern.document.domain;
import java.util.Optional;

import com.pattern.document.Document;
public interface HasPrice {
	String PROPERTY="price";
	default Optional<Number> getPrice(){
	return Optional.ofNullable((Number) get(PROPERTY));
	}
}