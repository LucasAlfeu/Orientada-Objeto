package br.li03ex02;

public class LampadaNatal extends Lampada{
    private String cor;
    
    public LampadaNatal(boolean state){
        super(state);
        this.cor = "Branca";
    }
    public LampadaNatal(boolean state, double pot, String color){
        super(state, pot);
        this.cor = color;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println(" e possui a cor "+this.cor);
    }
}
