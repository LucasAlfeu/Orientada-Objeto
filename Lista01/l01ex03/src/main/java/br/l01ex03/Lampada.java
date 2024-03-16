package br.l01ex03;

public class Lampada {
    private boolean estado;
    private double potencia;
    
    public Lampada(boolean state){
        this.estado = state;
        this.potencia = 60;
    }
    
    public Lampada(boolean state, double pot){
        this.estado = state;
        this.potencia = pot;
    }
    
    public String toString(){
        String text;
        if(this.estado){
            text = "A lampada está acesa e possui "+this.potencia+" W";
        } else {
        text =  "A lâmpada está desligada e possui "+this.potencia+" W";
        }
        return text;
    }
}
