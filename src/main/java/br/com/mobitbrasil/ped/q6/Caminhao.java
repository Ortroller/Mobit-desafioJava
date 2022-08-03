package br.com.mobitbrasil.ped.q6;

import java.util.ArrayList;
import java.util.List;

public class Caminhao extends Veiculo implements Exibivel{
    
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao(){
        super(null, new ArrayList<Peca>());
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public Caminhao(int toneladas, int alturaMax, int comprimento, Motor motor, List<Peca> pecas){
        super(motor, pecas);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Caminhao [alturaMax=" + alturaMax + ", comprimento=" + comprimento + ", toneladas=" + toneladas + "]";
    }

    public void exibir(){
        
        super.getMotor().exibir();
        
        System.out.println(
        "Toneladas: " + this.toneladas + 
        "\nAltura Máxima: " + this.alturaMax + 
        "\nComprimento: " + this.comprimento +
        "\nPecas-> "
        );

        super.getPecas().forEach((p) -> { p.exibir(); });
    }
}
