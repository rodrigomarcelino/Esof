package Entidades;

public class Baloes implements Componentes {

    private String nome;
    private double preco;
    
    public Baloes() {
        this.nome = "de Baloes";
        this.preco = 100.00;
    }

    
    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
       return this.nome;
    }
    
    
}
