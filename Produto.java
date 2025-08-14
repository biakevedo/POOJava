public class Produto {

    // Atributos
    public String nome;
    public double preco;
    public int estoque;
    public String marca;

    // Método mostrar informações do Produto
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }

    // Método para adicionar itens ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque adicionado. Novo estoque: " + estoque);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    // Método venda
    public void realizarVenda(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada. Novo estoque: " + estoque);
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }
}


