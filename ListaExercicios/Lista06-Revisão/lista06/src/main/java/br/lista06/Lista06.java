package br.lista06;

/**
 *
 * @author a1feu
 */
public class Lista06 {

    public static void main(String[] args) {
        RefeicaoVegetariana rv = new RefeicaoVegetariana();
        RefeicaoCompleta rc = new RefeicaoCompleta();
        rv.montaAlmoco();
        rc.montaAlmoco();
        System.out.println(rv);
        System.out.println("---------------------");
        System.out.println(rc);
    }
}
