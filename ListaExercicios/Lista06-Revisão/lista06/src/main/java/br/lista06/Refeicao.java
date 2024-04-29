package br.lista06;

import java.util.Scanner;

public abstract class Refeicao implements ItemDeRefeicao {
    protected String[] prato = new String [4];
    
    public void montaLanche(Refeicao refeicao){
        Scanner s = new Scanner(System.in);
        System.out.println("Monte seu prato: ");
        System.out.println("");
        System.out.println("\tVerdura:");
        this.mostraOpcoes(verduras);
        this.guardaOpcao(0, verduras);
        if (refeicao instanceof RefeicaoVegetariana == false){
            System.out.println("-------------------------------");
            System.out.println("\tProteina:");
            this.mostraOpcoes(proteinas);
            this.guardaOpcao(1, proteinas);
        }
        System.out.println("-------------------------------");
        System.out.println("\tCarboidrato:");
        this.mostraOpcoes(carboidratos);
        this.guardaOpcao(2, carboidratos);
        
        System.out.println("Escolha uma opcaoapenas");
        System.out.println("1: Fruta");
        System.out.println("2: Doce");
        int escolha = s.nextInt();
        switch(escolha){
            case 1:
                System.out.println("-------------------------------");
                System.out.println("\tFruta:");
                this.mostraOpcoes(frutas);
                this.guardaOpcao(3, frutas);
                break;
            case 2:
                System.out.println("-------------------------------");
                System.out.println("\tSobremesa:");
                this.mostraOpcoes(sobremesas);
                this.guardaOpcao(3, sobremesas);              
                break;
        }
          
    }
    
    protected void mostraOpcoes(String[] lista){
        int i = 0;
        for(String item : lista){
            System.out.println(i+": "+item);
            i += 1;
        }
    }
    
    protected void guardaOpcao(int posicao, String[] lista){
        Scanner s = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Digite 5 para nenhuma opcao");
        System.out.print("Opcao: ");
        int opcao = s.nextInt();
        if(opcao != 5){
            prato[posicao] = lista[opcao];
        } else {
        prato[posicao] = null;
        }
    }
    
    public String toString(){
        return "Seu prato{"+"Verdura: "+prato[0]+","+"Proteina: "+prato[1]+
                ","+"Carboidrato: "+prato[2]+","+"Sobremesa: "+prato[3]+"}";
    }
    
    public abstract void montaAlmoco();
    public abstract void montaJantar();
}
