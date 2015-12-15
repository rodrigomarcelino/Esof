package Entidades;

public class Flores extends ComponentesDecoradores {

    public Flores(Componentes componenteDecorado) {
        super(componenteDecorado);
        this.preco = 40.0;
        this.nome = "Flores";
    }
    
}
