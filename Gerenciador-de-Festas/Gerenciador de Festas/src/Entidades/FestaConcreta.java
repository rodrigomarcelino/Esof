
package Entidades;

import Controles.Singleton;
import java.util.ArrayList;
import javax.swing.*;


public class FestaConcreta implements Festa{

    private String tema;
    private String opcionais;
    private Data data;
    private int codigo;
    private double valor;
    
    public FestaConcreta(String tema, String opcionais, Data data, double valor) {
        this.tema = tema;
        this.opcionais = opcionais;
        this.data = data;
        this.valor = valor;
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public boolean cadastrarFesta(FestaConcreta f, String CPF){
        
        boolean result = false;
        
        
        if(f != null && f.getTema().length()>0 && f.getData()!=null)
        {
            Singleton.getInstance().cadastrarFesta(f, CPF);
            result = true;
        }
        
        return result;
    }
    
    
    
    public void atualizar(int i){
        ArrayList<FestaConcreta> listaFestas = new ArrayList<FestaConcreta>();
        
        listaFestas = Singleton.getInstance().getListaFestas();
        
        JOptionPane.showMessageDialog(null,"Festa de tema : "+listaFestas.get(i).getTema()+" na data : "+listaFestas.get(i).getData().getDia()+"/"+listaFestas.get(i).getData().getDia()+"/"+listaFestas.get(i).getData().getAno());
        
    }     
        
}
