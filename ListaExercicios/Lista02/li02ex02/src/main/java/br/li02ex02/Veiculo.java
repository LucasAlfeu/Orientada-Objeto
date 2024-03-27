/**
 * Os exercicios 2, 3 e 4 estão compreendidos nesse projeto l102ex02
 * A classe Consessionaria é a classe Li02ex02
 */

package br.li02ex02;

import br.li02ex02.Cliente;

public class Veiculo {
    private static int contador;
    private int nSerie;
    private int nRodas;
    private String tipoCombustivel;
    private String marca;
    private String modelo;
    private int ano;
    private String chassi;
    private long proprietario;
    
    public Veiculo(String combustivel, String marca, String modelo, int ano, String chassi){
        this.contador ++;
        this.nSerie = this.contador;
        this.nRodas = 4;
        this.tipoCombustivel = combustivel;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
    }
    public Veiculo(String combustivel, String marca, String modelo, int ano){
        this.contador ++;
        this.nSerie = this.contador;
        this.nRodas = 4;
        this.tipoCombustivel = combustivel;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void venda(Cliente p) throws Exception{
        this.proprietario = p.getCpf();
    }
    
    public String toString(){
        return ("Numero de Serie: "+this.nSerie+ "\n"
                + "Numero de Rodas: "+this.nRodas+ "\n"
                + "Combustivel: "+this.tipoCombustivel+ "\n"
                + "Marca: "+this.marca+ "\n"
                + "Modelo: "+this.modelo+ "\n"
                + "Ano: "+this.ano+ "\n"
                + "Numero do Cassi: "+this.chassi+ "\n"
                + "Proprietario: "+this.proprietario + "\n");
    }
}
