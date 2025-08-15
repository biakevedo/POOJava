public class Carro {

    // 1. Atributo

    public String marca;
    public String modelo;
    public int ano;
    public String descricao;
    public String combustivel;

    // 2. Método
    // Mostrar informações do Produto
    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Descrição: " + descricao);
        System.out.println("Combustível: " + combustivel);
    }

    // Método construtor
    public Carro(String marca, String modelo, int ano, String descricao, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.descricao = descricao;
        this.combustivel = combustivel;


    }
}
