package com.example.userservice.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dummy {

    // H2 testdb 자동 생성을 위한 더미 객체

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
