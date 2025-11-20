import java.util.*;

public class Estoque {

    // Mapa: código → lista com [nome, preço, quantidade]
    private Map<String, List<String>> estoque = new HashMap<>();

    // Adicionar produto
    public void adicionarProduto() {
        String codigo = Util.lerTexto("Código do produto: ");
        String nome   = Util.lerTexto("Nome do produto: ");
        double preco  = Util.lerDouble("Preço: ");
        int quantidade = Util.lerInteiro("Quantidade: ");

        List<String> info = new ArrayList<>();
        info.add(nome);
        info.add(String.valueOf(preco));
        info.add(String.valueOf(quantidade));

        estoque.put(codigo, info);

        System.out.println("Produto adicionado com sucesso!");
    }

    // Remover produto
    public void removerProduto() {
        String codigo = Util.lerTexto("Código do produto: ");

        if (estoque.remove(codigo) != null) {
            System.out.println("Produto removido.");
        } else {
            System.out.println("Código não encontrado.");
        }
    }

    // Atualizar quantidade
    public void atualizarQuantidade() {
        String codigo = Util.lerTexto("Código do produto: ");

        if (!estoque.containsKey(codigo)) {
            System.out.println("Código não encontrado.");
            return;
        }

        int novaQtd = Util.lerInteiro("Nova quantidade: ");
        estoque.get(codigo).set(2, String.valueOf(novaQtd));

        System.out.println("Quantidade atualizada!");
    }

    // Buscar produto
    public void buscarProduto() {
        String codigo = Util.lerTexto("Código do produto: ");

        if (!estoque.containsKey(codigo)) {
            System.out.println("Produto não encontrado.");
            return;
        }

        List<String> info = estoque.get(codigo);
        System.out.println("Nome: " + info.get(0));
        System.out.println("Preço: " + info.get(1));
        System.out.println("Quantidade: " + info.get(2));
    }

    // Listar produtos
    public void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n--- LISTA DE PRODUTOS ---");
        for (String codigo : estoque.keySet()) {
            List<String> info = estoque.get(codigo);
            System.out.println("Código: " + codigo +
                " | Nome: " + info.get(0) +
                " | Preço: " + info.get(1) +
                " | Quantidade: " + info.get(2));
        }
    }

    // Valor total do estoque
    public void calcularValorTotal() {
        double total = 0.0;

        for (List<String> info : estoque.values()) {
            double preco = Double.parseDouble(info.get(1));
            int qtd = Integer.parseInt(info.get(2));
            total += preco * qtd;
        }

        System.out.println("Valor total do estoque: R$ " + total);
    }
}
