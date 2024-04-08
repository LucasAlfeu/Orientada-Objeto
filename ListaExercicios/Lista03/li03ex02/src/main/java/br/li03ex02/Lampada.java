package br.li03ex02;

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
    
    public void imprimir(){
        if(this.estado){
            System.out.println("A lampada esta acesa e possui "+this.potencia+" W");
        } else {
            System.out.print("A lampada esta desligada e possui "+this.potencia+" W");
        }        
    }
}
