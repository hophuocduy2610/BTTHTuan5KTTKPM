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

    @Test
    void cau7(){
        System.out.println("Có " + mayBayRepository.findLoaiMayBay() + " máy bay Boeing");
    }
}
