package br.li02ex01;

public class ModeloDeComputador {
    private int memoriaRam;
    private int memoria;
    private double polegadasMonitor;
    private String processador;
    private double valor;
    
    public ModeloDeComputador(){
        this.valor= 0;
    }
    
    public ModeloDeComputador(int ram, int mem, double monitor){
        this.memoriaRam = ram;
        this.memoria = mem;
        this.polegadasMonitor = monitor;
        this.valor = 0;
    }
    
    public ModeloDeComputador(int ram, int mem, double monitor, String process){
        this.memoriaRam = ram;
        this.memoria = mem;
        this.polegadasMonitor = monitor;
        this.processador = process;
        this.valor = 0;
    }
    
    public void calculaPreco(double ram, double mem, double monitor, double process){
        this.valor = ram + mem + monitor + process;
        System.out.println("O valor total do seu computador: R$ "+valor);
    }
    
    public void calculaPreco(double ram, double mem, double process){
        this.valor = ram + mem + process;
        System.out.println("O valor total do seu computador: R$ "+valor);
    }
    
    public String toString(){
        return "O valor total do seu computador: R$ "+valor;
    }
}
