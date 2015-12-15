/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Eduardo
 */
public class Provensal implements Componentes{
    
    private String nome;
    private double preco;
    
    public Provensal() {
        this.nome = "Provensal";
        this.preco = 200.00;
    }
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
