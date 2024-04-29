/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.lista06;

/**
 *
 * @author a1feu
 */
public class RefeicaoCompleta extends Refeicao{

    @Override
    public void montaAlmoco() {
        super.montaLanche(this);
    }

    @Override
    public void montaJantar() {
        super.montaLanche(this);
    }
    
    public void montaChurrasco(){
        super.montaLanche(this);
    }
    
}
