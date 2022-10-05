package com.example.springbootapi.Service;

import com.example.springbootapi.Entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
    @Query("select nv from NhanVien nv where nv.luong < 10000")
    List<NhanVien> findNhanVienByLuong();
    @Query("select Sum(nv.luong) from NhanVien nv")
    int tinhTongLuong();
    @Query(value = "select nv.maNV from ChungNhan cn, MayBay mb, NhanVien nv " +
            "where nv.maNV = cn.MaNV and mb.maMB = cn.MaMB and mb.loai like 'Boeing%'", nativeQuery = true)
    List<String> getMaByLoaiMayBay();
    @Query(value = "select nv.maNV, nv.ten, nv.luong from NhanVien nv, ChungNhan cn" +
            " where nv.maNV = cn.MaNV and cn.MaMB = ?1", nativeQuery = true)
    List<NhanVien> findNhanVienByMaMB(int maMB);

}
