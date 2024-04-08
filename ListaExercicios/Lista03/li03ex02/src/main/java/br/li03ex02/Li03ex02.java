package br.li03ex02;

public class Li03ex02 {

    public static void main(String[] args) {
        LampadaIncandescente li = new LampadaIncandescente(false, 75);
        LampadaNatal ln = new LampadaNatal(true, 20, "Verde");
        
        System.out.println("Lampada Incandescente: ");
        li.imprimir();
        System.out.println("\n---------------------");
        System.out.println("Lampada de Natal");
        ln.imprimir();
    }
}
