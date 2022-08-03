package br.com.mobitbrasil.ped.q6;

public class Peca implements Exibivel{
    
    private String descricao;
    private String marca;

    public Peca(String descricao, String marca) {
        this.descricao = descricao;
        this.marca = marca;
    }

    public Peca() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void exibir(){
        System.out.println("Marca: " + this.marca + "\nDescrição: " + this.descricao);
    }
}
