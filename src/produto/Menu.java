package produto;

import java.util.Scanner;

import produto.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        ProdutoController controller = new ProdutoController();
        int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                       PADARIA                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto por Nome              ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nPadaria");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
			System.out.print("Nome do Produto: \n");
            String nome = leia.nextLine();
            System.out.print("Preço do Produto: \n");
            double preco = leia.nextDouble();
            leia.nextLine(); 
            System.out.print("Categoria do Produto: \n");
            String categoria = leia.nextLine();
            System.out.print("Quantidade do Produto: \n");
            int quantidade = leia.nextInt();
            leia.nextLine();  // Limpar o buffer de entrada
            ProdutoAlimenticio produto = new ProdutoAlimenticio(1, nome, categoria, quantidade, preco, "10/12/2024");
            controller.cadastrarProduto(produto);
            break;
				case 2:
					System.out.println("Listar Produtos\n\n");

					break;
				case 3:
					System.out.println("Consultar Produtos - por nome\n\n");

					break;
				case 4:
					System.out.println("Atualizar Produto\n\n");

					break;
				case 5:
					System.out.println("Apagar Produto\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Jessica Gomes - j.gomesss@outlook.com");
		System.out.println("https://github.com/jessicagomess");
		System.out.println("*********************************************************");
	}
}