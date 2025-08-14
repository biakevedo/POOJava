public class ContaBancaria {
    // Atributos
    String titular;
    double saldo;

    // Método depositar
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método pra sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    }



