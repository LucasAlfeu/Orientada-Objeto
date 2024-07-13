/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author a1feu
 */
public class Curso {
    //Um atributo para cada coluna da tabela
    private int id;
    private String nomecurso;
    private String nivel;
    private int duracao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String toString(){
        return this.nomecurso;
    }
    
    //No método equals eu defino qual é a regra a seguir para compara
    // dois objetos do tipo Curso
    // Os dois objetos serão iguais se os id's são iguais
    /**public boolean equals(Object o){
        Curso c = (Curso) o;
        if(this.id == c.getId()){
            return true;
        } else {
            return false;
        }
    }*/
}
