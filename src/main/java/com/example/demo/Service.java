package com.example.demo;

import org.apache.commons.lang3.RandomStringUtils;

@org.springframework.stereotype.Service
public class Service {

    public String getRundomString(int length) {
        return RandomStringUtils.random(length, true, false);
    }
}
