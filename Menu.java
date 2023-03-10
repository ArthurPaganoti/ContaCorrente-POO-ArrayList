import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ValidacaoConta valida = new ValidacaoConta();


        while (true) {
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("=============================");
            System.out.println("1- Criar um nova conta");
            System.out.println("=============================");
            System.out.println("2- Mostrar o extrato");
            System.out.println("=============================");
            System.out.println("3- Realizar saque");
            System.out.println("=============================");
            System.out.println("4- Realizar deposito");
            System.out.println("=============================");
            System.out.println("5- Transferencia");
            System.out.println("=============================");
            System.out.println("0- Para sair do menu de escolhas");
            System.out.println("=============================");
            int acao = sc.nextInt();

            switch (acao) {
                case 0:
                    System.out.println("Saindo do menu");
                    break;

                case 1:
                    System.out.println("Digite o nome do titular: ");
                    String nomeTitular = sc.next();

                    System.out.println("Digite o CPF: ");
                    String cpf = sc.next();

                    Pessoa titular = new Pessoa(nomeTitular, cpf);

                    System.out.println("Digite o número da conta: ");
                    String numeroConta = sc.next();

                    Operacao conta1 = new Operacao(titular, numeroConta);

                    valida.addOperacao(conta1);

                    System.out.println("Conta criada com sucesso");
                    break;

                case 2:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = sc.next();

                    Operacao op = valida.verificarContaExistente(numeroConta);

                    if (op != null) {
                        System.out.println("==========================");
                        System.out.println("Nome: " + op.getTitular().getNome());
                        System.out.println("Número da conta: " + op.getNumeroConta());
                        System.out.println("R$: " + op.getSaldo());
                        System.out.println("==========================");
                    } else {
                        System.out.println("A conta informada não foi encontrada, tente novamente");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = sc.next();

                    Operacao operacao = valida.verificarContaExistente(numeroConta);

                    if (operacao != null) {
                        System.out.println("Digite o valor que deseja sacar: ");
                        double valorSaque = sc.nextDouble();

                        if (operacao.sacar(valorSaque)) {
                            System.out.println("O saque foi realizado com sucesso");
                        } else {
                            System.out.println("Erro ao realizar o saque, tente novamente");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = sc.next();

                    Operacao operacao1 = valida.verificarContaExistente(numeroConta);

                    if (numeroConta != null) {
                        System.out.println("Digite o valor para o seu deposito: ");
                        double valorDeposito = sc.nextDouble();

                        if (operacao1.depositar(valorDeposito)) ;
                        System.out.println("Deposito realizado com sucesso");
                    } else {
                        System.out.println("Erro ao realizar o deposito, tente novamente");
                    }
                    break;

                case 5:
                    System.out.println("Digite o número da conta de origem: ");
                    String numeroContaOrigem = sc.next();

                    Operacao operacao2 = valida.verificarContaExistente(numeroContaOrigem);

                    if (operacao2 == null) {
                        System.out.println("Conta origem não encontrada, tente novamente");
                        continue;
                    }

                    System.out.println("Digite a conta do destinatário: ");
                    String numeroContaDestino = sc.next();

                    Operacao operacaoDestino = valida.verificarContaExistente(numeroContaDestino);

                    if (operacaoDestino == null) {
                        System.out.println("Conta destino não encontrada, tente novamente");
                        continue;
                    }

                    System.out.println("Digite o valor para ser realizada a transferência: ");
                    double valorTransferencia = sc.nextDouble();

                    if (operacao2.transferir(valorTransferencia, operacaoDestino)) {
                        System.out.println("Transferência realizada com sucesso");
                    } else {
                        System.out.println("Erro ao realizar a transferência, tente novamente");
                    }
                    break;

                default: System.out.println("Selecione uma opção valida");
                    System.out.println("==============================");
            }
        }
    }
}