package br.lista06;

public class RefeicaoVegetariana extends Refeicao implements ItemDeRefeicao{
    
    @Override
    public void montaAlmoco() {
        super.montaLanche(this);
    }

    @Override
    public void montaJantar() {
        super.montaLanche(this);
    }
    
}
