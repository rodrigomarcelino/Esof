/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controles;

import Entidades.*;
import java.util.*;

public class Singleton {

    private static Singleton instancia;
    private ArrayList<FestaConcreta> listaFestas;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<String> listaTemasInfantis;
    private ArrayList<String> listaTemasEspeciais;

    private Singleton() {
        listaFestas = new ArrayList<FestaConcreta>();
        listaClientes = new ArrayList<Cliente>();

        listaTemasInfantis = new ArrayList<String>();
        listaTemasInfantis.add("Frozen");
        listaTemasInfantis.add("Patati Patata");
        listaTemasInfantis.add("Carros");
        listaTemasInfantis.add("Princesas Disney");
        listaTemasInfantis.add("Fundo do Mar");
        listaTemasInfantis.add("Fazendinha");

        listaTemasEspeciais = new ArrayList<String>();
        listaTemasEspeciais.add("Casamento");
        listaTemasEspeciais.add("15 anos");
        listaTemasEspeciais.add("Formatura");

    }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public ArrayList<FestaConcreta> getListaFestas() {
        return listaFestas;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<String> getListaTemasInfantis() {
        return listaTemasInfantis;
    }

    public ArrayList<String> getListaTemasEspeciais() {
        return listaTemasEspeciais;
    }

    public void adicionarTema(String t){
        listaTemasInfantis.add(t);
    }
    public void cadastrarCliente(Cliente c) {
        c.setQtd(0);
        listaClientes.add(c);
        //System.out.println(listaClientes.get(0).getNome()+" "+listaClientes.get(0).getCPF()+" "+listaClientes.get(0).getEndereco()+" "+listaClientes.get(0).getQtd());
    }

    public void cadastrarFesta(FestaConcreta f, String CPF) {
        int cod;
        int i = 0;
        for (i = 0; i < listaClientes.size(); i++) {
            if (CPF.equals(listaClientes.get(i).getCPF())) {
                break;
            }
        }
        listaClientes.get(i).setQtd(listaClientes.get(i).getQtd() + 1);

        listaFestas.add(f);
        cod = listaFestas.indexOf(f);
        f.setCodigo(cod);

    }
}
