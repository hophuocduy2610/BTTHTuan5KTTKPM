package com.example.springjpatestpractice.repository;

import com.example.springjpatestpractice.entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
   @Query("select nv from NhanVien nv where nv.luong < 10000")
    List<NhanVien> findNhanVienByLuong();
}
