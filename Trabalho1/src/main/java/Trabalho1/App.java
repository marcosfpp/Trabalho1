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
        
        boolean usuarioExistente;
        int numeroClientes = 0;
        int vagasClientes = 0;
        int quantidade = 0;
        String nomeUsuario, emailUsuario, contatoUsuario, idUsuario;
        int cod_livro;
        
        
        //Inserir os verificadores aqui
        boolean v_codigolivro = false;
     
        
        
        Clientes[] clientes = new Clientes[5];
        Emprestimo[] emprestimo = new Emprestimo[5];
        Livros[] livros = new Livros[5];
        
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
                                    System.out.println("Digite o número o CPF para identificação:");
                                    idUsuario = scan.nextLine();

                                    clientes[i] = new Clientes(nomeUsuario, emailUsuario, idUsuario, contatoUsuario);
                                    System.out.println("O usuário " + clientes[i].getNome() + "foi cadastrado!\n");
                                    scan.nextLine();
                                }
                                    }

                        }catch(Exception e){System.out.println("Erro ao cadastrar cliente!");
                        scan.nextLine();}
                        
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
                                System.out.println("Digite seu id de cliente:");
                                idUsuario = scan.nextLine();
                                scan.nextLine();
                                
                                    for (int i = 0; i < clientes.length; i++) {
                                        //Fazer uma validação de usuário quando puder
                                        if (clientes[i].getQtdEmprestada() > 0) {
                                            for (int j = 0; j < emprestimo.length; j++) {
                                                if (emprestimo[j] != null) { // Validação da existência do empréstimo                                                   System.out.println("");
                                                    //Aqui dá para jogar outro if para o usuário válidar seus empréstimos(nome livro, data...)
                                                
                                                }
                                            }
                                        }
                                    System.out.println("Digite o código do livro para a devolução:");
                                    cod_livro = scan.nextInt();
                                    for (int a = 0; a < livros.length; a++) {
                                            //Dá para jogar verificação de livro encontrado aqui, verificar com o pessoal
                                        if (livros[a] != null) {
                                            if (livros[a].Codigolivro() == cod_livro) {//Criar get para puxar código livro
                                                for (int j = 0; j < emprestimo.length; j++) {
                                                    if (emprestimo[j].getUsuario().getId()== idUsuario) {
                                                        if (emprestimo[j].getLivro().getCodigolivro() == cod_livro) { //Criar get puxar livro
                                                            v_codigolivro = true;
                                                            //Validar as verificaçãoes em boolean nesses finais de código, replicar para o código acima desse
                                                            break;
                                                        }
                                                    }
                                                }
                                            }if (v_codigolivro) {
                                                for (int j = 0; j < emprestimo.length; j++) {
                                                    if (emprestimo[j] != null) {
                                                        if (emprestimo[j].getUsuario().getId() == idUsuario) {
                                                            if (emprestimo[j].getLivro().getCodigolivro() == cod_livro) {
                                                                emprestimo[j].getLivro().aumentarlivro(1);
                                                                emprestimo[j].setDataEmprestimo(null);
                                                                emprestimo[j].finalizarEmprestimo();
                                                                emprestimo[j].verificarDisponibilidade();
                                                                emprestimo[j].isEmprestimoAtivo();
                                                                System.out.println("O " + "foi devolvido");// Depois do + printar nome livro
                                                                
                                                            }
                                                        }
                                                        
                                                    }
                                                
                                                }
                                            } else  {
                                                System.out.println("Erro, o código não condiz ao usuário emprestado");
                                            }
                                        } else {
                                            System.out.println("Código do livro inexistente");
                                        }
                                    } // parei aqui, ainda existe mais coisa
                                }
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
