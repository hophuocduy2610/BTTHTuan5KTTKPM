package com.example.springjpatestpractice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NhanVienRepositoryTests {
    @Autowired
    NhanVienRepository nhanVienRepository;
    @Test
    void cau3(){
        System.out.println(nhanVienRepository.findNhanVienByLuong());
    }
    @Test
    void cau8(){
        System.out.println("Tổng lương phải trả cho nhân viên: " + nhanVienRepository.tinhTongLuong());
    }
}
