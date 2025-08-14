public class Main {
    public static void main(String[] args) {

     // Produto
        Produto prod1 = new Produto();
        prod1.nome = "Monitor";
        prod1.preco = 850.00;
        prod1.marca = "Dell";

        prod1.mostrarInformacoes();

        Produto prod2 = new Produto();
        prod1.nome = "Notebook";
        prod1.preco = 3000.00;
        prod1.marca = "Dell";

        prod2.mostrarInformacoes();

        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.ano = 1994;
        carro1.combustivel = "Gasolina";
        carro1.modelo = "Uno Mille";

        carro1.mostrarInformacoes();

        Carro carro2 = new Carro();
        carro2.marca = "Hyundai";
        carro2.ano = 2020;
        carro2.combustivel = "Flex";
        carro2.modelo = "HB20";

        carro2.mostrarInformacoes();

        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Bohemian Rhapsody";
        minhaMusica.artista = "Queen";
        minhaMusica.tempoDeDuracao = 355;

        System.out.println("Tocando agora: " + minhaMusica.titulo);
        System.out.println("Artista: " + minhaMusica.artista);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carlos";
        aluno1.nota = 8.5;

        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        aluno2.nota = 6.0;

        aluno2.verificarStatus();

        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.titular = "Juliana";
        minhaConta.saldo = 1000.0;

        minhaConta.depositar(500.0);
        System.out.println("Novo saldo após depósito: " + minhaConta.saldo);

        minhaConta.sacar(200.0);
        System.out.println("Novo saldo após saque: " + minhaConta.saldo);


        minhaConta.sacar(1500.0);

        Produto prod3 = new Produto();
        prod3.nome = "Camiseta";
        prod3.preco = 30.00;
        prod3.estoque = 10;

        prod3.mostrarInformacoes();
        prod3.adicionarEstoque(5);
        prod3.realizarVenda(3);
        prod3.realizarVenda(15);









    }
}