/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Controles.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Cliente {

    
        
    private String nome;
    private String CPF;
    private String telefone;
    private String endereco;
    private int qtd;
    
    public Cliente(String nome, String CPF, String telefone, String endereco, int qtd) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
        this.qtd = qtd;
    }

    
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
        public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    
    public boolean cadastrarCliente(Cliente c){
        
        boolean result = false;
        
        if(c != null && c.getNome().length()>0 && c.getCPF().length() == 11 && c.getTelefone().length() == 8)
        {
            Singleton.getInstance().cadastrarCliente(c);
            result = true;
        }
        
        return result;
    }
    
    public boolean verificaCliente(String CPF){
        
        boolean result = false;
        ArrayList<Cliente> lista = Singleton.getInstance().getListaClientes();
        for(int i=0; i<lista.size();i++){
            if(CPF.equals(lista.get(i).getCPF()))
            {   //System.out.println("teste verifica cliente");
                result = true;
        
            }
        }
        return result;
    }
}
