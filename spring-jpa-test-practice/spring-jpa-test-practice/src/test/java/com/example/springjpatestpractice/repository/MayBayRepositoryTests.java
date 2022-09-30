package com.example.springjpatestpractice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MayBayRepositoryTests {
    @Autowired
    MayBayRepository mayBayRepository;
    @Test
    void cau2(){
        System.out.println(mayBayRepository.findLoaiMayBayByTamBay());
    }
}
