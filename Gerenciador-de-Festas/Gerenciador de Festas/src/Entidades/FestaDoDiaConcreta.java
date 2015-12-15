/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Controles.Singleton;
import java.util.ArrayList;

public class FestaDoDiaConcreta implements FestaDoDia{
    ArrayList<FestaConcreta> f;
    ArrayList<FestaConcreta> f2;
    
    public FestaDoDiaConcreta(){
        this.f = new ArrayList<FestaConcreta>();
        this.f2 = new ArrayList<FestaConcreta>();
    }
        
    public ArrayList <FestaConcreta> notificarObservadores(Data data){
        f = Singleton.getInstance().getListaFestas();
        //System.out.println("ENTROU NOTIFICAR OBSERVADORES DATA :"+data.getDia()+"/"+data.getMes()+"/"+data.getAno());
        for(int i = 0; i<f.size();i++){
            //System.out.println("ENTROU FOR NOTIFICAR OBESERVADORES i="+i+" tema="+f.get(i).getTema());
            if((f.get(i).getData().getDia() == data.getDia()) && (f.get(i).getData().getMes() == data.getMes()) && (f.get(i).getData().getAno() == data.getAno())){
                //System.out.println("ENTROU DO IF DENTRO DO FOR i="+i+" tema de f="+f.get(i).getTema());
                f.get(i).atualizar(i);
                f2.add(f.get(i));
                //System.out.println("SAIU DO IF DENTRO DO FOR i="+i+" tema de f2="+f2.get(i).getTema());
            }
        }
        return f2;
    }
}
