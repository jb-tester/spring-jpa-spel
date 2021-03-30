package com.mytests.spring_data.spring_jpa_spel.repositories;

/**
 * *
 * <p>Created by irina on 29.03.2021.</p>
 * <p>Project: spring-jpa-spel</p>
 * *
 */
public class MyUtil {

    public MyUtil(Integer number) {
        this.number = number;
    }

    Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
