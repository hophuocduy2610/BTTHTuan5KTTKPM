package com.example.springjpatestpractice.repository;

import com.example.springjpatestpractice.entity.MayBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MayBayRepository extends CrudRepository<MayBay, Integer> {
    @Query("select mb.loai from MayBay mb where mb.tamBay > 10000")
    List<String> findLoaiMayBayByTamBay();

    @Query("select count(mb) from MayBay mb where mb.loai like 'Boeing%'")
    int findLoaiMayBay();
}
