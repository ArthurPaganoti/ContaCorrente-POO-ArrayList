class Operacao {

    private Pessoa titular;
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Operacao(Pessoa titular, String numeroConta, String agencia, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Operacao(Pessoa titular, String numeroConta) {
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Operacao contaDestino) {
        if(this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }

    }
}