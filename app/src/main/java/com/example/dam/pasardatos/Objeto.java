package com.example.dam.pasardatos;

import java.io.Serializable;

//Ponemos serializable para poder pasarlo pero no es la mejor forma

public class Objeto implements Serializable {

    private int i;

    public Objeto(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
