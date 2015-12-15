package Entidades;

public class Borboleta extends ComponentesDecoradores{

    public Borboleta(Componentes componenteDecorado) {
        super(componenteDecorado);
        this.preco = 30;
        this.nome = "Borboleta";
    }
    
}
