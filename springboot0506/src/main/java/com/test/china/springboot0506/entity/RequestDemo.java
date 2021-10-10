package com.test.china.springboot0506.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class RequestDemo  {
    person person;
    @JsonProperty(value = "test_old" ,required = true)
    String Demo;
    @JsonProperty(value = "demo_old" ,required = true)
    String test;
    String AA;
}
