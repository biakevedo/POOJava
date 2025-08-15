public class Produto {

    // Atributos
    private String nome;
    public double preco;
    public int estoque;
    public String marca;

    // Método de mostrar informações do produto
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }

    // get
    public String getNome(){
        return nome;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }


    // Método construtor
    public Produto(String nome, double preco, String marca, int estoque ){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.estoque = estoque;
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


