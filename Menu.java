public class Menu {

    private Estoque estoque = new Estoque();

    public void executarPrograma() {

        int opcao;

        do {
            System.out.println("\n===== ESTOQUE - LOJA DE ELETRÔNICOS =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Atualizar quantidade");
            System.out.println("4 - Buscar produto");
            System.out.println("5 - Listar produtos");
            System.out.println("6 - Calcular valor total do estoque");
            System.out.println("0 - Sair");
            
            opcao = Util.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> estoque.adicionarProduto();
                case 2 -> estoque.removerProduto();
                case 3 -> estoque.atualizarQuantidade();
                case 4 -> estoque.buscarProduto();
                case 5 -> estoque.listarProdutos();
                case 6 -> estoque.calcularValorTotal();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
