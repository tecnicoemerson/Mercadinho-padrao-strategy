package strategy;

public class ProdutoDeLimpezaCorredor implements ProdutoDeLimpeza {

    @Override
    public void pegarDetergente() {
        System.out.println("Você colocou um detergente no carrinho!");
    }

    @Override
    public void pegarEsponja() {
        System.out.println("Você colocou uma esponja no carrinho!");
    }

    @Override
    public void pegarDesinfetante() {
        System.out.println("Você colocou um desinfetante no carrinho!");
    }

    @Override
    public void pegarSabaoEmPo() {
        System.out.println("Você colocou sabão em pó no carrinho!");
    }

    @Override
    public void pegar() {

    }
}