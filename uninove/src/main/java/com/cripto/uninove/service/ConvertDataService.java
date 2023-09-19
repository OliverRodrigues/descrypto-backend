package com.cripto.uninove.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ConvertDataService implements IConvertDataService{

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T convertData(String json, Class<T> t) {
        System.out.println("method not implemented");
        return null;
    }

    @Override
    public <T> List<T> convertDataToList(String json, Class<T> elementClass) {
        try {
            // Define o tipo JavaType para representar uma lista do tipo desejado.
            JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, elementClass);
            return mapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
