import strategy.*;

public class Start {
    public static void main(String[] args) {
        //Strategy - padrão Comportamental

        Pessoa pessoa = new Pessoa();

        ProdutoDeHigiene higiene = new ProdutoDeHigieneCorredor();
        pessoa.setCompra(higiene);
        pessoa.pegarSabonete();
        pessoa.pegarShampoo();
        System.out.println();

        ProdutoDeLimpeza limpeza = new ProdutoDeLimpezaCorredor();
        pessoa.setCompra(limpeza);
        pessoa.pegarDesinfetante();
        pessoa.pegarDetergente();
        pessoa.pegarEsponja();
        System.out.println();

        Alimento alimento = new AlimentoCorredor();
        pessoa.setCompra(alimento);
        pessoa.pegarArroz();
        pessoa.pegarFeijao();
        System.out.println();

        System.out.println("Caminhando até o caixa . . .");
        System.out.println("Comprando . . .");
        System.out.println("Produtos comprados . . .");
    }
}