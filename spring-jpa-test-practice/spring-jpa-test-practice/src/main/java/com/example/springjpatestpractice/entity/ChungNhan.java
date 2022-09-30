package com.example.springjpatestpractice.entity;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;

@Enabled
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan {
    @Id
    @JoinColumn(name = "manv", columnDefinition = "varchar(10)")
    @ManyToOne
    public NhanVien maNV;

    @Id
    @JoinColumn(name = "mamb", columnDefinition = "int")
    @ManyToOne
    public MayBay maMB;
}
