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
        
        boolean usuarioExistente, livroExistente;//variaveis para listagem
        int cadastClientes = 0; // quantidade de usuarios a serem cadastrados
        int cadastLivros = 0; // quantidade de livros a serem cadastrados
        int vagasClientes = 0; //auxiliar para verificação de espaço no array
        int quantidade = 0; // quantidade de usuarios
        int quantLivros = 0; // quantidade de livros
        int sobraLivros = 0;
        int idUsuario = 0;
        String nomeUsuario, emailUsuario, contatoUsuario;
        int cod_livro;
        
        
        //Inserir os verificadores aqui
        //Lógica de devolução
        boolean v_codigousuario = false;
        boolean v_codigolivro = false;
        boolean v_usu_livro = false;
        //
     
        
        
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
                        System.out.println("Deseja cadastrar um livro, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                                
                            for (int i = 0; i < livros.length; i++){
                                if(livros[i] != null){
                                    quantLivros++;
                                }
                            }
                            sobraLivros = livros.length - quantLivros;
                            System.out.println("Ainda suportamos o cadastro de: " + sobraLivros + " livros");
                            
                            System.out.println("Deseja cadastrar quantos livros? ");
                            cadastLivros = scan.nextInt();
                            scan.nextLine();
                            
                            if (cadastLivros > sobraLivros) {

                                System.out.println("Não temos vagas suficientes para esse cadastro.");

                            } else {
                                for (int i = cadastLivros; i < (cadastLivros + quantLivros); i++) {
                                    System.out.println("Digite o título do livro: ");
                                    String nomeLivro = scan.nextLine();
                                    System.out.println("\n");

                                    System.out.println("Digite o(s) autor(es) do livro: ");
                                    String nomeAutor = scan.nextLine();
                                    System.out.println("\n");

                                    System.out.println("Digite o ano de publicação: ");
                                    int anoPublicacao = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("\n");

                                    System.out.println("Digite a quantidade de exemplares disponíveis: ");
                                    int numeroExemplares = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("\n");
                                    
                                    int idLivro = (i = i + 1);
                                    Livros informacoesLivro = new Livros(idLivro, nomeLivro, nomeAutor, anoPublicacao, numeroExemplares);
                                    livros[quantLivros] = informacoesLivro;
                                }
                                    }
                            
                        }
                        break;

                    case 2:
                        System.out.println("Deseja cadastrar um usuário, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                                for (int i = 0; i < clientes.length; i++) {
                                    if (clientes[i] != null) {
                                    cadastClientes++;

                                 }
                                }
                            vagasClientes = clientes.length - cadastClientes; //Ter ideia de vagas preenchidas
                            System.out.println("Existem " + vagasClientes + " vagas disponíveis para cadastro.");
                            scan.nextLine();

                            System.out.println("Quantos usuários deseja cadastrar?");
                            quantidade = scan.nextInt();

                            if (quantidade > vagasClientes) {

                                System.out.println("Não temos vagas suficientes para esse cadastro.");
                                
                            } else {
                                for (int i = cadastClientes; i < (cadastClientes + quantidade); i++) {
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
                        
                        }
                        break;

                    case 3:
                        // Contador de empréstimos 
                        int qtdEmprestimos = 0;
                        
                    
                        // Entrada de usuário
                        String escolha;
                        int idUsu;
                        System.out.println("Digite seu ID de cliente: ");
                        idUsu = scan.nextInt();
                        scan.nextLine();
                        int codigo_e;
                        String dataEmprestimo;
                        
                        
                        
                    try {
                      boolean clienteEncontrado = false;
                      boolean livroEncontrado = false;
                      boolean possuiMaisDe3Emprestimos = false;
                      boolean livroJaEmprestado = false;
                     
                      
                  
                      
                        System.out.println("==========================="); 
                        System.out.println("          EMPRÉSTIMO      ");
                        System.out.println("===========================");
                        
                        System.out.println("Deseja pegar um livro emprestado? (s/n): ");
                        escolha = scan.next().trim().toLowerCase();
                        scan.nextLine();
                        
                        while (escolha.equals("sim") || escolha.equals("s")){
                            System.out.println("Digite seu ID de cliente: ");
                            idUsu = scan.nextInt();
                            scan.nextLine();
                        
                        // busca pelo cliente 
                        Clientes clienteSelecionado = null;
                        for (Clientes cliente : clientes) {
                            if (cliente != null && cliente.getId() == (idUsu)) {
                                clienteSelecionado = cliente;
                                clienteEncontrado = true;
                                break;
                            }
                        }
                            if (!clienteEncontrado) {
                                System.out.println("Cliente não cadastrado!");
                            }  else {
                                // Verifica se o cliente já possui um empréstimo ativo
                                boolean clienteJaPossuiEmprestimoAtivo = false;
                                for (Emprestimo emprestimo : emprestimos) {
                                    if (emprestimo != null && emprestimo.getCliente().getId().equals(idUsu) && emprestimo.isEmprestimoAtivo()) {
                                        clienteJaPossuiEmprestimoAtivo = true;
                                        break;
                                    }
                                }
                                if (clienteJaPossuiEmprestimoAtivo) {
                                    System.out.println("Este cliente já possui um empréstimo ativo. Conclua antes de fazer outro empréstimo.");
                                } else { System.out.println("Informe o código do livro que deseja pegar emprestado: ");
                                codigo_e = scan.nextInt();
                                scan.nextLine();
                                
                                //Busca pelo livro
                                Livros livroSelecionado = null;
                                for (Livros livro : livros){
                                    if (livro != null && livro.getMostrarIdLivro() == codigo_e) {
                                        livroSelecionado = livro;
                                        livroEncontrado = true;
                                        break;
                                    }
                                }
                                
                            if(!livroEncontrado) {    
                                System.out.println("Livro não encontrado.");
                            } else if(!livroSelecionado.verificarDisponibilidade()) {
                                System.out.println("O livro não possui exemplares disponíveis.");
                            } else {
                                    System.out.println("Informe a data de empréstimo (dd/mm/aaaa)");
                                    dataEmprestimo = scan.nextLine();
                            
                            // Registra o novo empréstimo
                            emprestimos[qtdEmprestimos++] = new Emprestimo(livroSelecionado, dataEmprestimo, clienteSelecionado);
                            emprestimos[qtdEmprestimos - 1].realizarEmprestimo();
                            System.out.println("Empréstimo realizado com sucesso!");
                            
                            //Atualiza quantidade de exemplares do livro e do cliente
                            livroSelecionado.setPegarlivro(1);
                            clienteSelecionado.setQuantidadeEmprestimos(1);
                          }      
                      }   
                   }
                
                System.out.println("Deseja realizar outro empréstimo? (s/n): ");
                escolha = scan.next().toLowerCase();
                scan.nextLine();
               }
            
                    } catch(Exception e) {
                        System.out.println("Erro na entrada de dados. Verifique e tente novamente.");
                        scan.nextLine(); // Limpa a entrada para evitar looping em caso de erro
                    }   
                    break;
                    
                    case 4:
                        System.out.println("Deseja fazer a devolução de algum livro, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                                System.out.println("Digite seu id de cliente:");
                                idUsuario = scan.nextInt();
                                scan.nextLine();
                                
                                for (int i = 0; i < clientes.length; i++) {
                                    if (clientes[i] != null && clientes[i].getId() == idUsuario) {
                                        v_codigousuario = true;
                                        if (clientes[i].getMostrarQuantidadeEmprestada() > 0) {// mudar essa lógica aqui
                                            v_usu_livro = true;
                                            for (int j = 0; j < emprestimo.length; j++) {
                                                if (emprestimo[j] != null) { // Validação da existência do empréstimo  
                                                    System.out.println("O usuario: " + clientes[j].getNome() + " está com o livro: " + livros[j].getMostrarNome());
                                                    System.out.println(clientes[j].getNome() + " deseja devolver o livro acima? S ou N");
                                                    opc_sec = scan.nextLine();
                                                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                                                        for (int k = 0; emprestimo.length < 10; k++) {
                                                            if (emprestimo[k] != null) {
                                                                if (emprestimo[k].getCliente().getId() == idUsuario) {
                                                                    if (emprestimo[k].getLivro().getMostrarIdLivro() == cod_livro) {
                                                                        emprestimo[k].setDataEmprestimo(null);
                                                                        emprestimo[k].verificarDisponibilidade();
                                                                        emprestimo[k].finalizarEmprestimo();
                                                                        emprestimo[k].getLivro().
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    System.out.println("Digite o código do livro para a devolução:");
                                    cod_livro = scan.nextInt();
                                    for (int a = 0; a < livros.length; a++) {
                                            //Dá para jogar verificação de livro encontrado aqui, verificar com o pessoal
                                        if (livros[a] != null) {
                                            if (livros[a].getMostrarIdLivro()== cod_livro) {
                                                for (int j = 0; j < emprestimo.length; j++) {
                                                    if (emprestimo[j].getCliente().getId()== idUsuario) {
                                                        if (emprestimo[j].getLivro().getMostrarIdLivro() == cod_livro) {
                                                            v_codigolivro = true;
                                                            //Validar as verificaçãoes em boolean nesses finais de código, replicar para o código acima desse
                                                            break;
                                                        }
                                                    }
                                                }
                                            }if (v_codigolivro) {
                                                for (int j = 0; j < emprestimo.length; j++) {
                                                    if (emprestimo[j] != null) {
                                                        if (emprestimo[j].getCliente().getId() == idUsuario) {
                                                            if (emprestimo[j].getLivro().getMostrarIdLivro() == cod_livro) {
                                                                emprestimo[j].getLivro().setDevolverLivros(1);
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
                        livroExistente = false;
                        quantLivros = 0;
                        System.out.println("Deseja listar todos os livros, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                                
                                for(Livros liv : livros){
                                    if(liv != null){
                                        livroExistente = true;
                                        quantLivros++;
                                        System.out.println(livros);
                                    }
                                }
                            }catch (Exception e) {
                                System.out.println("Mensagem de erro");
                            }
                        }
                        break;

                    case 6:
                        quantidade = 0;
                        usuarioExistente = false;
                        System.out.println("Deseja listar todos os usuários, digite S ou N");
                        opc_sec = scan.nextLine();
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            try {
                                for (Clientes cli : clientes){
                                    if (cli != null) {
                                        usuarioExistente = true;
                                        System.out.println(clientes);
                                        quantidade++;
                                        
                                    }
                                }
                              
                                
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


