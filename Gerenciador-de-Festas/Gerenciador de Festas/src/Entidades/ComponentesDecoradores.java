/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public abstract class ComponentesDecoradores implements Componentes{
    protected Componentes componenteDecorado;
    protected double preco;
    protected String nome;
    
    public ComponentesDecoradores(Componentes componenteDecorado)
    {
        this.componenteDecorado = componenteDecorado;
    }
    
    public double getPreco() {
        return componenteDecorado.getPreco()+this.preco;
    }

    public String getNome() {
        return this.nome+" "+componenteDecorado.getNome();
    }


   
}
