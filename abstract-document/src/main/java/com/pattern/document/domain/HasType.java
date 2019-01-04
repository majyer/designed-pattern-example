package com.pattern.document.domain;
import java.util.Optional;
import com.pattern.document.Document;
public interface HasType extends Document{
	 String PROPERTY = "type";

  default Optional<String> getType() {
      return Optional.ofNullable((String) get(PROPERTY));
  }
}
