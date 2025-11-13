package com.psp.hilos.museo;

public class Sala {

    public int aforo;

    public Sala() {
        this.aforo = 100;
    }

    synchronized void incrementar() {
        this.aforo++;
    }

    synchronized void decrementar() {
        this.aforo--;
    }
}
