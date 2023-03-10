Utilizando a classe Conta, definida anteriormente, crie um programa que simule um Banco. O banco que
possuirá um ArrayList de Contas. O sistema deve entrar em um laço infinito que exibe e execute as
seguintes opções para o usuário:

1. Criar uma nova conta
   Solicite ao usuário os dados pessoais do cliente e os dados obrigatórios para criação da conta,
   utilizando os construtores para instanciar os respectivos objetos. Ao final adicione o objeto Conta
   no ArrayList.


2. 
    Exibir o saldo, ou extrato, de uma conta
   O usuário deve informar o número da conta. O sistema deve recuperar a Conta correspondente,
   pelo número da conta, e exibir o extrato (número da conta, nome do usuário e saldo da conta).
   Após a operação o sistema deve voltar a exibir as opções.

   

3.
    Sacar um valor de uma conta
   O usuário deve informar o número da conta, por exemplo, e o valor a ser sacado. O sistema deve
   recuperar a conta correspondente do ArrayList, pelo número da conta, e executar o método sacar
   verificando o retorno. Se o retorno for true, exibir uma mensagem de saque efetuado com sucesso;
   caso contrário, uma mensagem de saque não efetuado. Em ambos os casos o sistema deve voltar
   a exibir as opções.


4. 
    Depositar um valor em uma conta
   O usuário deve informar o número da conta, por exemplo, e o valor a ser depositado. O sistema
   deve recuperar a conta correspondente do ArrayList, pelo número da conta, e executar o método
   depositar. Após o processo concluído deve exibir as opções.



5. valores de uma conta para outra
   O usuário deve informar o número da conta, por exemplo, o valor a ser transferido e o número da
   conta que receberá a transferência. O sistema buscar as duas contas correspondentes do ArrayList
   e realizar a solicitação (transferência). Se o retorno for true, exibir uma mensagem de Transferência
   efetuada com sucesso; caso contrário, uma mensagem de Transferência não efetuado; Em ambos
   os casos o sistema deve voltar a exibir as opções.
   
   
![00059-49274940](https://user-images.githubusercontent.com/106690302/224194061-69106018-a3b2-44bd-a7e7-009bb9a9594e.png)

