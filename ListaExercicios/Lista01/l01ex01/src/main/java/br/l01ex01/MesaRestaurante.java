package br.l01ex01;

import java.util.Scanner;

public class MesaRestaurante {
    private int qntPedidos;
    private double total = 0;

    public MesaRestaurante(){
        this.qntPedidos = 0;
    }
     

    public void adicionaAoPedido(){
        boolean maisPedido = true;
        Scanner leitor = new Scanner(System.in);
        char resposta;

        System.out.println();

        while(maisPedido == true){
            System.out.println("Algum pedido? s/n");
            resposta = leitor.next().charAt(0);
            if (resposta == 's') {
                qntPedidos += 1;
                this.calculaTotal(this.fazPedidos());
            } else {
                maisPedido = false;
            }
        }
        System.out.println("Numero de pedidos: "+qntPedidos);
        this.imprimirTotal();
        this.zeraPedidos();
        System.out.println();
    }

    private void calculaTotal(double valorPedido){
        this.total += valorPedido;
    }

    private void imprimirTotal(){
        System.out.println("Valor total: R$ "+this.total);
    }

    public void zeraPedidos(){
        this.total = 0;
    }

    private void mostraCardapio(){
        System.out.println("1 - Hamburguer - R$ 15.00");
        System.out.println("2 - Hot Dog - R$ 10.00");
        System.out.println("3 - Coxinha - R$ 4.00");
        System.out.println("4 - Pizza - R$ 35.00");
        System.out.println("5 - Sunday - R$ 8.00");
        System.out.println();
    }

    private double fazPedidos(){
        double pedido = 0;
        int numDoPedido;

        this.mostraCardapio();
        System.out.print("Insira o código do pedido: ");
        System.out.print("");
        Scanner leitor = new Scanner(System.in);
        numDoPedido = leitor.nextInt();

        switch (numDoPedido) {
            case 1:
                System.out.println("Hamburguer");
                pedido = 15.00;
                break;
            case 2:
                System.out.println("Hot Dog");
                pedido = 10.00;
                break;
            case 3:
            System.out.println("Coxinha");
                pedido = 4.00;
                break;
            case 4:
                System.out.println("Pizza");
                pedido = 35.00;
                break;
            case 5:
                System.out.println("Sunday");
                pedido = 8.00;
                break;
            default:
                break;
        }
        return pedido;
    }
}