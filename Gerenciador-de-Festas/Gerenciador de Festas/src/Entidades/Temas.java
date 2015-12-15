package Entidades;

import java.util.*;


public class Temas {

    private ArrayList<String> infantis = new ArrayList<String>(); //{"Frozen","Patati Patata","Carros","Princesas Disney","Fundo do mar"};
    private ArrayList<String> especiais = new ArrayList<String>(); //{"Casamento", "15 anos", "Formatura"};
    
    public Temas()
    {
        especiais.add("Casamento");
        especiais.add("15 anos");
        especiais.add("Formatura");
        infantis.add("Frozen");
        infantis.add("Patati Patata");
        infantis.add("Carros");
        infantis.add("Princesas Disney");
        infantis.add("Fundo do mar");
        infantis.add("Fazendinha");
    }
    
    public ArrayList<String> getInfantis() {
        return infantis;
    }

    public void setInfantis(ArrayList<String> infantis) {
        this.infantis = infantis;
    }

    public ArrayList<String> getEspeciais() {
        return especiais;
    }

    public void setEspeciais(ArrayList<String> especiais) {
        this.especiais = especiais;
    }
    
    public void adicionarTema(String t){
        infantis.add(t);
    }
    
}
