package strategy;

public class Pessoa {

    private Compra compra;

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void pegar(){
        compra.pegar();
    }

    public void pegarLenso() {
        if (compra instanceof ProdutoDeHigiene) {
            ((ProdutoDeHigiene) compra).pegarLenso();
        } else {
            System.out.println("O Robo não pode pegar lenso. Configure um ProdutoDeHigiene.");
        }
    }

    public void pegarSabonete() {
        if (compra instanceof ProdutoDeHigiene) {
            ((ProdutoDeHigiene) compra).pegarSabonete();
        } else {
            System.out.println("O Robo não pode pegar sabonete. Configure um ProdutoDeHigiene.");
        }
    }

    public void pegarShampoo() {
        if (compra instanceof ProdutoDeHigiene) {
            ((ProdutoDeHigiene) compra).pegarShampoo();
        } else {
            System.out.println("O Robo não pode pegar shampoo. Configure um ProdutoDeHigiene.");
        }
    }

    public void pegarPasta() {
        if (compra instanceof ProdutoDeHigiene) {
            ((ProdutoDeHigiene) compra).pegarPasta();
        } else {
            System.out.println("O Robo não pode pegar pasta de dente. Configure um ProdutoDeHigiene.");
        }
    }

    public void pegarDetergente() {
        if (compra instanceof ProdutoDeLimpeza) {
            ((ProdutoDeLimpeza) compra).pegarDetergente();
        } else {
            System.out.println("O Robo não pode pegar detergente. Configure um ProdutoDeLimpeza.");
        }
    }

    public void pegarEsponja() {
        if (compra instanceof ProdutoDeLimpeza) {
            ((ProdutoDeLimpeza) compra).pegarEsponja();
        } else {
            System.out.println("O Robo não pode pegar esponja. Configure um ProdutoDeLimpeza.");
        }
    }

    public void pegarDesinfetante() {
        if (compra instanceof ProdutoDeLimpeza) {
            ((ProdutoDeLimpeza) compra).pegarDesinfetante();
        } else {
            System.out.println("O Robo não pode pegar desinfetante. Configure um ProdutoDeLimpeza.");
        }
    }

    public void pegarSabaoEmPo() {
        if (compra instanceof ProdutoDeLimpeza) {
            ((ProdutoDeLimpeza) compra).pegarSabaoEmPo();
        } else {
            System.out.println("O Robo não pode pegar sabão em pó. Configure um ProdutoDeLimpeza.");
        }
    }

    public void pegarArroz() {
        if (compra instanceof Alimento) {
            ((Alimento) compra).pegarArroz();
        } else {
            System.out.println("O Robo não pode pegar arroz. Configure um Alimento.");
        }
    }

    public void pegarFeijao() {
        if (compra instanceof Alimento) {
            ((Alimento) compra).pegarFeijao();
        } else {
            System.out.println("O Robo não pode pegar feijão. Configure um Alimento.");
        }
    }

    public void pegarMacarrao() {
        if (compra instanceof Alimento) {
            ((Alimento) compra).pegarMacarrao();
        } else {
            System.out.println("O Robo não pode pegar macarrão. Configure um Alimento.");
        }
    }

    public void pegarCarne() {
        if (compra instanceof Alimento) {
            ((Alimento) compra).pegarCarne();
        } else {
            System.out.println("O Robo não pode pegar carne. Configure um Alimento.");
        }
    }
}