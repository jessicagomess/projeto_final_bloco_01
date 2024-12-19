package produto.model;

public class ProdutoAlimenticio extends Produto {

    private String dataValidade;

	public ProdutoAlimenticio(int id, String nome, String categoria, int quantidade, double preco, String dataValidade) {
    	super(id, nome, categoria, quantidade, preco);
        this.dataValidade = dataValidade;

    }

	 // Getter
    public String getDataValidade() {
        return dataValidade;
    }

    // Setter
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;  
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Validade: " + dataValidade;
    }

    

}
