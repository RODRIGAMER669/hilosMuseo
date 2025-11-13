package com.psp.hilos.museo;

public class Main {
    public final static int TOTAL = 100;

    public static void main(String[] args) throws InterruptedException{
        Sala sala = new Sala();

        for (int i = 0; i < 1000; i++) {
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
        }
        for (int i = 0; i < 1000; i++) {
            Thread salida = new Thread(new Salida(sala));
            salida.start();
        }
        Thread.sleep(TOTAL*10);
        System.out.println("Aforo final: " + sala.aforo);
    }
}
