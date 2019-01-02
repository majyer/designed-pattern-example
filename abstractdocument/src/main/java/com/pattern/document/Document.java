package com.pattern.document;

public interface Document {
    void put(String key,Object value);
    Object get(String key);
    <T> Stream<T> children(String key,Function<map<String,Object>,T> constructor);
}
