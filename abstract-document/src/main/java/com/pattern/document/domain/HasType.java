package com.pattern.document.domain;
import com.iluwatar.abstractdocument.Document;

import java.util.Optional;
public interface HasType {
	 String PROPERTY = "type";

  default Optional<String> getType() {
    return Optional.ofNullable((String) get(PROPERTY));
}
