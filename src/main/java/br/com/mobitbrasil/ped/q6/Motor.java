package br.com.mobitbrasil.ped.q6;

public class Motor implements Exibivel{

    private int potencia;
    private int cilindrada;

    public Motor(int potencia, int cilindrada) {
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }
    
    public void exibir(){
        System.out.println("Potencia: " + potencia + "\nCilindrada: " + cilindrada);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // @Override
    // public String toString() {
    //     return "Motor [cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
    // }
    
}
