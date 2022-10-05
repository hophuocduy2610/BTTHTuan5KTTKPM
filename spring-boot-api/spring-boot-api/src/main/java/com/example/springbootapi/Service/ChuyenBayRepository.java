package com.example.springbootapi.Service;

import com.example.springbootapi.Entity.ChuyenBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
    @Query("select cb from ChuyenBay cb where cb.gaDen = ?1")
    List<ChuyenBay> findChuyenBayByGaDen(String gaDen);
    @Query("select cb from ChuyenBay cb where cb.doDai between 8000 and 10000")
    List<ChuyenBay> findChuyenBayByDoDai();
    @Query("select cb from ChuyenBay cb where cb.gaDi = 'SGN' and cb.gaDen = 'BMV'")
    List<ChuyenBay> findChuyenBayByGaDiVaGaDen();
    @Query("select count(cb) from ChuyenBay cb where cb.gaDi = ?1")
    int findChuyenBayByGaDi(String gaDi);
    @Query("select cb from ChuyenBay cb " +
            "where cb.doDai <= (select mb.tamBay from MayBay mb where mb.loai = ?1)")
    List<ChuyenBay> findChuyenBayByMayBayAirbusA320(String loaiMB);
    //SELECT * FROM chuyenbay WHERE (GaDi, GaDen) IN (SELECT GaDen, GaDi FROM chuyenbay)
    @Query(value = "select * from chuyenbay cb where (cb.gaDi, cb.gaDen) in (select cb1.gaDen, cb1.gaDi from chuyenbay cb1)", nativeQuery = true)
    List<ChuyenBay> findCBDiTuGaADenBVeLaiA();
}
