package strategy;

public class ProdutoDeHigieneCorredor implements ProdutoDeHigiene {

    @Override
    public void pegarLenso() {
        System.out.println("Você colocou um lenço no carrinho!");
    }

    @Override
    public void pegarSabonete() {
        System.out.println("Você colocou um sabonete no carrinho!");
    }

    @Override
    public void pegarShampoo() {
        System.out.println("Você colocou um shampoo no carrinho!");
    }

    @Override
    public void pegarPasta() {
        System.out.println("Você colocou uma pasta de dente no carrinho!");
    }

    @Override
    public void pegar() {

    }
}