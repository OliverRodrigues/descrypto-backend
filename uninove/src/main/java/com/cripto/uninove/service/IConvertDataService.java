package com.cripto.uninove.service;

import java.util.List;

public interface IConvertDataService {

    <T> T convertData(String json, Class<T> t);
    <T> List<T> convertDataToList(String json, Class<T> elementClass);
}
