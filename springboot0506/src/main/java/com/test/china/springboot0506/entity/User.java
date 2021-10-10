package com.test.china.springboot0506.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {

    @JsonProperty("name")
    private String name;
    @JsonProperty("password")
    private String password;



    private String id;

    public static void initParam(){
        User user = new User();
        user.id="";
        
    }

    public void intr2p(){
        User user = new User();
    }
}
