package com.example.springjpatestpractice.entity;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Enabled
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manv", columnDefinition = "varchar(9)")
    public NhanVien MaNV;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mamb", columnDefinition = "int")
    public MayBay MaMB;
}
