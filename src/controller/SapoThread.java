package controller;

import java.util.Random;

public class SapoThread extends Thread{

    private String nome;
    private int distanciaMaxima;
    private int tamanhoMaximoSalto;

    public SapoThread(String nome, int distanciaMaxima, int tamanhoMaximoSalto) {
        this.nome = nome;
        this.distanciaMaxima = distanciaMaxima;
        this.tamanhoMaximoSalto = tamanhoMaximoSalto;
    }

    @Override
    public void run() {
        int distanciaPercorrida = 0;

        while (distanciaPercorrida < distanciaMaxima) {

            int tamanhoSalto = (int) (Math.random() * (tamanhoMaximoSalto + 1));
            distanciaPercorrida += tamanhoSalto;
            if (distanciaPercorrida > distanciaMaxima) {
                distanciaPercorrida = distanciaMaxima;
            }
            System.out.println(nome + " saltou " + tamanhoSalto + " metros e percorreu " + distanciaPercorrida + " metros.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " chegou!");
    }
}
