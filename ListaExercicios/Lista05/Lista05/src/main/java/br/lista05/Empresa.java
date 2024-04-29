/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.lista05;

/**
 *
 * @author a1feu
 */
public class Empresa {
    protected String nome;
    protected String cgc;
    protected String cidade;
    protected String estado;
    protected String cep;
    protected String telefone;
    
    public Empresa(){
        
    }
    
    public Empresa(String nome, String cgc, String cidade, String estado, String cep, String telefone){
        this.nome = nome;
        this.cgc = cgc;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }
    
    public String toString(){
        return "Empresa{ nome: "+
    }
}
