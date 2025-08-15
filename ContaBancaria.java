public class ContaBancaria {
    // Atributos
    String titular;
    double saldo;

    // Método depositar
    public void depositar(double valor) {
        // saldo += valor; - são a mesma coisa
        saldo = saldo+valor; // saldo recebe o que eu tinha mais o que estou recebendo agora
    }

    // Método pra sacar
    public void sacar(double valor) {
        // saldo -= valor; - assim dá o resultado pedido
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método de exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    }



