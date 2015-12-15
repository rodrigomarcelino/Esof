package Entidades;

public class Armario extends ComponentesDecoradores{

    public Armario(Componentes componenteDecorado) {
        super(componenteDecorado);
        this.nome = "Armario";
        this.preco = 40;
    }
}
