package produto.controller;

import produto.model.Produto;
import produto.repository.ProdutoRepository;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController implements ProdutoRepository {

	private List<Produto> produtos = new ArrayList<>();

    @Override
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtos;
    }

    @Override
    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null; // Se não encontrar
    }

    @Override
    public boolean atualizarProduto(int id, Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getId() == id) {
                produtos.set(i, produtoAtualizado); // Substitui o produto
                System.out.println("Produto atualizado com sucesso!");
                return true;
            }
        }
        System.out.println("Produto não encontrado.");
        return false;
    }

    @Override
    public boolean apagarProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto); // Remove o produto
            System.out.println("Produto removido com sucesso!");
            return true;
        }
        System.out.println("Produto não encontrado.");
        return false;
    }
}
