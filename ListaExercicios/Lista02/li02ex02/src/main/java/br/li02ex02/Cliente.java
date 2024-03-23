package br.li02ex02;

public class Cliente {
    private String nome;
    private long cpf;
    private long telefone;
    private long celular;
    
    public Cliente(String n, long cpf, long tel, long cel){
        this.nome = n;
        this.cpf = cpf;
        this.telefone = tel;
        this.celular = cel;
    }
       public Cliente(String n, long cpf, long tel){
        this.nome = n;
        this.cpf = cpf;
        this.telefone = tel;
    }
    public Cliente(String n, long cpf){
        this.nome = n;
        this.cpf = cpf;
    }
    
    private boolean ehValido(long cpf){
        if(cpf % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public long getCpf() throws Exception{
        if (this.ehValido(this.cpf)){
            return this.cpf;
        } else {
            throw new Exception("CPF invalido");
        }
    }
    
}
