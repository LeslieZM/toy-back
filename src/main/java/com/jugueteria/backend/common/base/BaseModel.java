package com.jugueteria.backend.common.base;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseModel {
    

    /*Convierte todo el objeto a Json */
    @Override
    public String toString(){
    try{
        return new ObjectMapper().writeValueAsString(this);
    }catch(JsonProcessingException e){
    return "Failed to convert object to JSON string: " + ToStringBuilder.reflectionToString(this,
        ToStringStyle.JSON_STYLE,true);
    }
}
}
