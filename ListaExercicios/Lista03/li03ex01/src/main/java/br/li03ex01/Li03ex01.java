/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.li03ex01;

/**
 *
 * @author a1feu
 */
public class Li03ex01 {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4);
        Retangulo ret = new Retangulo(2,3);
        Circulo cir = new Circulo(3,4);
        
        System.out.println(quadrado.calculaArea(quadrado.lado));
        System.out.println(quadrado.calcularPerimetro(quadrado.lado));
        System.out.println(ret.calculaArea(ret.lado1, ret.lado2));
        System.out.println(ret.calcularPerimetro(ret.lado1, ret.lado2));
        cir.calculaPerimetro();
        cir.calculaArea();
    }
}
