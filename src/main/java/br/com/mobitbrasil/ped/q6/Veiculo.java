package br.com.mobitbrasil.ped.q6;

import java.util.List;

public class Veiculo {

    private Motor motor;
    private List<Peca> pecas;
    
    public Veiculo(Motor motor, List<Peca> pecas) {
        this.motor = motor;
        this.pecas = pecas;
    }

    public Veiculo() {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

}
