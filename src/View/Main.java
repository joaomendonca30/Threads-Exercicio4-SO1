package View;

import controller.SapoThread;

public class Main {
    public static void main(String[] args) {

        int distanciaMaxima = 100;
        int tamanhoMaximoSalto = 10;


        SapoThread[] sapos = new SapoThread[5];
        for (int i = 0; i < sapos.length; i++) {
            sapos[i] = new SapoThread("Sapo " + (i + 1), distanciaMaxima, tamanhoMaximoSalto);
            sapos[i].start();
        }

        for (SapoThread sapo : sapos) {
            try {
                sapo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}