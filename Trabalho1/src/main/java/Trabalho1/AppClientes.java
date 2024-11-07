package Trabalho1;

import java.util.Scanner;

public class AppClientes {

    //criação de função menu
    public static void menu() {
        System.out.println("[=========DEVS LIBRARY========]");
        System.out.println("1 - [CADASTRO DE LIVROS]\n");
        System.out.println("2 - [CADASTRO USUÁRIO]\n");
        System.out.println("4 - [LISTAGEM DE USUÁRIOS]\n");
        System.out.println("4 - [LISTAGEM DE LIVROS]\n");
        System.out.println("3 - [EMPRÉSTIMO]\n");
        System.out.println("4 - [DEVOLUÇÃO]\n");
        System.out.println("5 - [SAIR]\n");
        System.out.println("[=============================]");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean usuarioExistente;
        int numeroClientes = 0;
        int vagasClientes = 0;
        int quantidade = 0;
        int idUsuario = 0;
        String nomeUsuario, emailUsuario, contatoUsuario;

        Clientes[] clientes = new Clientes[5];

        //acesso ao menu
        menu();
        System.out.println("Escolha a opção desejada: ");
        int opc = scan.nextInt();

        while (opc != 5) {
            switch (opc) {

                case 2:
                    try{
                    numeroClientes = 0;
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] != null) {
                            numeroClientes++;

                        }
                    }
                            vagasClientes = clientes.length - numeroClientes; //Ter ideia de vagas preenchidas
                            System.out.println("Existem " + vagasClientes + " vagas disponíveis para cadastro.");
                            scan.nextLine();

                            System.out.println("Quantos usuários deseja cadastrar?");
                            quantidade = scan.nextInt();

                            if (quantidade > vagasClientes) {

                                System.out.println("Não temos vagas suficientes para esse cadastro.");

                            } else {
                                for (int i = numeroClientes; i < (numeroClientes + quantidade); i++) {
                                    scan.nextLine();
                                    System.out.println("Digite o nome do usuário:");
                                    nomeUsuario = scan.nextLine();
                                    System.out.println("Digite o e-mail do usuário:");
                                    emailUsuario = scan.nextLine();
                                    System.out.println("Digite o número para contato");
                                    contatoUsuario = scan.nextLine();
                                    
                                    idUsuario = (i + 1);

                                    clientes[i] = new Clientes(nomeUsuario, emailUsuario, idUsuario, contatoUsuario);
                                    System.out.println("O usuário " + clientes[i].getNome() + "foi cadastrado!\n");
                                    scan.nextLine();
                                }
                                    }

                        }catch(Exception e){System.out.println("Erro ao cadastrar cliente!");
                        scan.nextLine();}
                    
                    break;
                    
                case 4:
                    // tentativa de uma listagem simples
                     for (int i = 0; i < clientes.length; i++) {
                         System.out.println("\n" + clientes[i].toString() + "\n" + clientes[i].getEmail() + "\n" + clientes[i].getTelefone());
                        
                    }
                    
                case 5:
                    System.out.println("Obrigado por usar nosso sistemas!");
                default:
                    System.out.println("Digite uma opção válida!");
            
            }

        }

    
    }
}