package com.wprotheus.pmd2a04atv02.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Disciplina implements Serializable {
    private int image;
    private String name;

    public Disciplina() {
    }

    public Disciplina(int image, String name) {
        this.image = image;
        this.name = name;
    }
}