package br.li03ex01;

/**
 *
 * @author a1feu
 */
public class PoligonoRegular {
    public double calcularPerimetro(int lado){
        return lado*4;
    }
    public double calcularPerimetro(int lado1, int lado2){
        return (lado1*2 + lado2*2);
    }
    
    public double calculaArea(int lado){
        return lado*lado;
    }
    
    public double calculaArea(int lado1, int lado2){
        return lado1*lado2;
    }
}
