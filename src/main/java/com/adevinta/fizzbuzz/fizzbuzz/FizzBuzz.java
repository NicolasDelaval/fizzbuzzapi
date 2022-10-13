package com.adevinta.fizzbuzz.fizzbuzz;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "topfizz")
public class FizzBuzz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int int1;

    private int int2;

    @Transient
    private int intLimit;

    private String str1;

    private String str2;
}
