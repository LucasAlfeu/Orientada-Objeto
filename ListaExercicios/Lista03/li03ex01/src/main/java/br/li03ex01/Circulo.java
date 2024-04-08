package br.li03ex01;

/**
 *
 * @author a1feu
 */
public class Circulo {
   private int raio;
   private int centro;
   
   Circulo(int r, int c){
       this.raio = r;
       this.centro = c;
   }
   
   public void calculaPerimetro(){
       double peri;
       peri = 2*3.14*this.raio;
       System.out.println("Perimetro: "+peri);
   }
   
   public void calculaArea(){
       double area;
       area = 3.14 *this.raio*this.raio;
       System.out.println("Area: "+area);
   }
}
