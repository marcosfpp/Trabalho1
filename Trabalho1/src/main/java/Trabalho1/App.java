package Trabalho1;

import java.util.Scanner;

public class App{
    // Criado a função menuinicial com objetivo de mostrar o menu da biblioteca ao usuário.
    public static void menuinicial() {
        System.out.println("MENU");
        System.out.println("1- CADASTRO LIVRO");
        System.out.println("2- CADASTRO USUÁRIO");
        System.out.println("3- REALIZAR EMPRÉSTIMO");
        System.out.println("4- REALIZAR DEVOLUÇÃO");
        System.out.println("5- LISTAGEM DE LIVROS");
        System.out.println("6- LISTAGEM DE USUÁRIOS");
        System.out.println("7- EMPRÉSTIMOS ATIVOS");
        System.out.println("8- SAIR");
    }

    // Inicialização do código principal.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a biblioteca :)");

        // Opção que permiti o usuário conferir se ele quer utilizar o programa ou não.
        System.out.println("Você deseja utilizar nossa biblioteca, digite S ou N:");
        String opc_sec = scan.nextLine();

        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
            menuinicial();
            System.out.println("Digite a opção que deseja prosseguir:");
            int opc_pri = scan.nextInt();

            // Inicialização da estrutura de escolha do usuário.
            while (opc_pri != 8) {
                switch (opc_pri) {
                    case 1:
                        System.out.println("Deseja cadastrar um usuário, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            } catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Deseja cadastrar um livro, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Deseja fazer o empréstimo de algum livro, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Deseja fazer a devolução de algum livro, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Deseja listar todos os livros, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Deseja listar todos os usuários, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 7:
                        System.out.println("Deseja consultar os empréstimos ativos, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    default:
                        System.out.println("Selecione a opção correta!");
                        break;
                }

                // Caso o usuário escreva uma opção que não é desejada.
                menuinicial();
                System.out.println("Digite uma opção válida:");
                opc_pri = scan.nextInt();
            }
        }
    }
}
