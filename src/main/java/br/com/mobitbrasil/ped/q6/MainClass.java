package br.com.mobitbrasil.ped.q6;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    
    public static void main(String[] args){

        /* *********************** CARRO *********************** */
        List<Peca> wrxPecas = new ArrayList<Peca>();
        wrxPecas.add(new Peca("Rolamento admissor turbo prata", "TPs"));
        wrxPecas.add(new Peca("Freio esportivo", "Brembo"));
        wrxPecas.add(new Peca("Intercooler frontal", "Subaru"));

        CarroPasseio carro = new CarroPasseio("Vermelho", "WRX Impreza", new Motor(260, 2500), wrxPecas);
        carro.exibir();

        /* *********************** CAMINHAO *********************** */
        List<Peca> volvoPeca = new ArrayList<Peca>();
        volvoPeca.add(new Peca("Bateria 180A", "Moura"));
        volvoPeca.add(new Peca("DVD multimídia", "Pioneer"));

        Caminhao caminhao = new Caminhao();

        caminhao.setAlturaMax(3);
        caminhao.setComprimento(10);
        caminhao.setToneladas(7);
        caminhao.setMotor(new Motor(750, 16100));
        caminhao.setPecas(volvoPeca);
        caminhao.exibir();

    }
}
