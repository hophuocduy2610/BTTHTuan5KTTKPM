package com.example.springjpatestpractice.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "mamb")
    public int maMB;

    @Column(name = "loai")
    public String loai;

    @Column(name = "tambay")
    public int tamBay;
}
