package com.pattern.document;

import java.util.List;
import java.util.Map;
import java.util.Stream;
import java.util.Objects;
import java.util.Optional;
import java.util.Function.Function;

public abstract class AbstractDocument implements Document {
    private final Map<String,Object> properties;

    protected AbstractDocument(Map<String,Object> properties){
        Object.requireNonNull(properties,"properties map is required");
        this.properties =properties;
    }

    @Override
    public void put(String key,Object value)
    {
        properties.put(key,value);
        return null;
    }
    @Override
    public Object get(String key)
    {
        return properties.get(key);
    }
    @Override
    public <T> Stream<T> children(String key,Function<Map<String,Object>,T>constructor){
        Optional<List<Map<String,Object>>> any=Stream.of(get(key)).filter(el -> el != null)
                .map(el->(List<Map<String,Object>>) el).findAny();
        return any.isPresent()? any.get().stream().map(construct):Stream.empty();
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName()).append("[");
        properties.entrySet().forEach(e -> builder.append("[").append(e.getKey()).append(":").append(e.getValue()).append("]"));
        builder.append("]");
        return builder.toString();
    }
}
