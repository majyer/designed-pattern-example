package com.pattern.document.domain;
import java.util.stream.Stream;

import com.pattern.document.Document;
public interface HasParts {
	String PROPERTY="parts";
	default Stream<Part> getParts(){
		return children(PROPERTY,Part::new);
	}
}
