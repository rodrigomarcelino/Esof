package Entidades;

public class Baleiro extends ComponentesDecoradores{

    public Baleiro(Componentes componenteDecorado) {
        super(componenteDecorado);
        this.nome = "Baleiro";
        this.preco = 10;
    }
    
}
