package strategy;

public class AlimentoCorredor implements Alimento {

    @Override
    public void pegarArroz() {
        System.out.println("Você colocou arroz no carrinho!");
    }

    @Override
    public void pegarFeijao() {
        System.out.println("Você colocou feijão no carrinho!");
    }

    @Override
    public void pegarMacarrao() {
        System.out.println("Você colocou macarrão no carrinho!");
    }

    @Override
    public void pegarCarne() {
        System.out.println("Você colocou carne no carrinho!");
    }

    @Override
    public void pegar() {

    }
}