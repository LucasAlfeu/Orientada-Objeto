package br.li02ex01;

public class Li02ex01 {
    public static void main(String[] args) {
        ModeloDeComputador comp1 = new ModeloDeComputador(8, 512, 27, "Ryzen 5");
        
        comp1.calculaPreco(150,45, 500, 1500);
        //comp1.toString();
        //System.out.print("hello world");
    }
}
