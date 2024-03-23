package br.li02ex02;

public class Li02ex02 {

    public static void main(String[] args) throws Exception {
        Cliente lucas = new Cliente("Lucas", 1234);
        Cliente carlos = new Cliente("Carlos", 123); 
            // Da´ra um erro quando chamar o metodo toString de proposito pois o cpf é impar
        
        Veiculo corsa = new Veiculo("Gasolina/GNV", "Chevrolet", "Corsa", 2010);
        Veiculo palio = new Veiculo("Alcool", "Fiat", "Palio", 2015, "BDGAW7529U3");
        corsa.venda(lucas);
        palio.venda(lucas);
        System.out.println(corsa.toString());
        System.out.println(palio.toString());
        
        Veiculo monza = new Veiculo("Gasolina", "Chevrolet", "Monza", 1982, "BW34TSD");
        monza.venda(carlos);
        System.out.println(monza.toString());
        
    }
}
