package com.pattern.document.domain;

import java.util.Map;
import com.pattern.document.AbstractDocument;

public class Car extends AbstractDocument implements HasModel,HasPrice,HasParts{
	public Car(Map<String,Object> properties){
		super(properties);
	}
}
