package br.com.mobitbrasil.ped.q6;

import java.util.ArrayList;
import java.util.List;

public class CarroPasseio extends Veiculo implements Exibivel{
    
    private String cor;
    private String modelo;

    public CarroPasseio(){
        super(null, new ArrayList<Peca>());
        this.cor = null;
        this.modelo = null;
    }

    public CarroPasseio(String cor, String modelo, Motor motor, List<Peca> pecas){
        super(motor, pecas);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibir(){
        
        super.getMotor().exibir();
        
        System.out.println("Cor: " + this.cor + "\nModelo: " + this.modelo + "\nPecas-> ");

        super.getPecas().forEach((p) -> { p.exibir(); });

    }
}
