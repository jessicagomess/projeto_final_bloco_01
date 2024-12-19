package produto.model;

public class ProdutoComum extends Produto {

    public ProdutoComum(int id, String nome, String categoria, int quantidade, double preco) {
        super(id, nome, categoria, quantidade, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Comum [ID=" + getId() + ", Nome=" + getNome() + 
                           ", Categoria=" + getCategoria() + ", Quantidade=" + getQuantidade() + 
                           ", Preço=" + getPreco() + "]");
    }

}
