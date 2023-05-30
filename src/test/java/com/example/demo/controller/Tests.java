package com.example.demo.controller;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Tests {

    @Test
    public void test(){
        Assertions.assertThat("test").isEqualTo("test"); //일부러 실패한 테스트 깃허브 ci테스트
    }

    @Test
    public void test2(){
        Assertions.assertThat(1).isEqualTo(2);
    }

}
