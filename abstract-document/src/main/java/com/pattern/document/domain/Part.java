package com.pattern.document.domain;
import java.util.Map;
import com.pattern.document.AbstractDocument;

public class Part extends AbstractDocument implements HasType,HasModel,HasPrice{
	public Part(Map<String,Object> properties){
		super(properties);
	}
}

