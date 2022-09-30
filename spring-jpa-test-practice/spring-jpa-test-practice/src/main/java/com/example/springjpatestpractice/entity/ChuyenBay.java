package com.example.springjpatestpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "macb")
    public String maCB;
    @Column(name = "gadi")
    public String gaDi;
    @Column(name = "gaden")
    public String gaDen;
    @Column(name = "dodai")
    public int doDai;
    @Column(name = "giodi")
    public Time gioDi;
    @Column(name = "gioden")
    public Time gioDen;
    @Column(name = "chiphi")
    public int chiPhi;

}
