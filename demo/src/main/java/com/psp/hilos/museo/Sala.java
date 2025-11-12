package com.psp.hilos.museo;

public class Sala {

    public int aforo;

    public Sala() {
        this.aforo = 100;
    }

    public void incrementar() {
        this.aforo++;
    }

    public void decrementar() {
        this.aforo--;
    }
}
