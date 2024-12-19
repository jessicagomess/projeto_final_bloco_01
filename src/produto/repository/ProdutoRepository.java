package produto.repository;

import java.util.List;

import produto.model.Produto;

public interface ProdutoRepository {
    void cadastrarProduto(Produto produto);
    List<Produto> listarProdutos();
    Produto buscarProdutoPorId(int id);
    boolean atualizarProduto(int id, Produto produtoAtualizado);
    boolean apagarProduto(int id);

}
