package Trabalho1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class App {

    // Inicialização do código principal.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cadastClientes = 0; // quantidade de usuarios a serem cadastrados
        int quantLivros = 0; // quantidade de livros
        int qtdEmprestimos = 0;
        int idUsuario = 0;
        String nomeUsuario, emailUsuario;
        int contatoUsuario;
        int opc_pri;
        int l = -1;
        int c = -1;
        int em = -1;

        Clientes[] clientes = new Clientes[5];
        Emprestimo[] emprestimo = new Emprestimo[5];
        Livros[] livros = new Livros[5];

        // Inicialização da estrutura de escolha do usuário.
        do {
            System.out.println("Bem vindo a biblioteca!");
            System.out.println("MENU");
            System.out.println("1- CADASTRO LIVRO");
            System.out.println("2- CADASTRO USUÁRIO");
            System.out.println("3- REALIZAR EMPRÉSTIMO");
            System.out.println("4- REALIZAR DEVOLUÇÃO");
            System.out.println("5- LISTAGEM DE LIVROS");
            System.out.println("6- LISTAGEM DE USUÁRIOS");
            System.out.println("7- EMPRÉSTIMOS ATIVOS");
            System.out.println("8- EXPORTAR DADOS");
            System.out.println("9- SAIR");
            
            System.out.println("Digite a opção que deseja prosseguir:");
            opc_pri = scan.nextInt();
            scan.nextLine();
            System.out.println("\n");

          

            switch (opc_pri) {
                case 1:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         CADASTRO LIVROS      ");
                    System.out.println("===========================");
                    try {
                        System.out.println("Deseja cadastrar um livro, digite S ou N");
                        String opc_sec = scan.nextLine();
                        System.out.println("\n");


                        while ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            // verifica se a arrray esta cheia para cadastro de livros
                            if (l >= livros.length - 1) {
                                System.out.println("Nao foi possivel cadastrar mais livros! Espaço insuficiente!");
                                scan.nextLine();
                                break;
                            }
                            l++;
                            // percorrer a array livros para ver quantos livros estao cadastrados
                            for (int i = 0; i < livros.length; i++) {
                                if (livros[i] != null) {
                                    quantLivros++;
                                }
                            }
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

                            int idLivro = l + 1;
                            Livros informacoesLivro = new Livros(idLivro, nomeLivro, nomeAutor, anoPublicacao, numeroExemplares);
                            livros[quantLivros] = informacoesLivro;

                            System.out.println("Deseja continuar cadastrando? ");
                            opc_sec = scan.nextLine();
                            System.out.println("\n\n");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar livro!");
                        scan.nextLine();
                    }

                    System.out.println("\n\n");
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         CADASTRO USUÁRIOS      ");
                    System.out.println("===========================");
                    try {
                        System.out.println("Deseja cadastrar um usuário, digite S ou N");
                        String opc_sec = scan.nextLine();
                        System.out.println("\n");

                        while ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            // valida se tem espaço na array 
                            if (c >= livros.length - 1) {
                                System.out.println("Nao foi possivel cadastrar mais usuarios! Espaço insuficiente!");
                                scan.nextLine();
                                break;
                            }
                            c++;
                            for (int i = 0; i < clientes.length; i++) {
                                if (clientes[i] != null) {
                                    cadastClientes++;
                                }
                            }

                            System.out.println("Digite o nome do usuário:");
                            nomeUsuario = scan.nextLine();

                            System.out.println("Digite o e-mail do usuário:");
                            emailUsuario = scan.nextLine();

                            System.out.println("Digite o número para contato");
                            contatoUsuario = scan.nextInt();
                            scan.nextLine();

                            idUsuario = c + 1;
                            clientes[cadastClientes] = new Clientes(nomeUsuario, emailUsuario, idUsuario, contatoUsuario);

                            System.out.println("Deseja cadastrar outro cliente? ");
                            opc_sec = scan.nextLine();
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar cliente!");
                        scan.nextLine();
                    }
                    System.out.println("\n\n");
                    break;

                case 3:
                        System.out.println("\n");
                        System.out.println("===========================");
                        System.out.println("          EMPRÉSTIMO      ");
                        System.out.println("===========================");
                    try {

                        System.out.println("Deseja pegar um livro emprestado? (s/n): ");
                        String escolha = scan.next().trim().toLowerCase();
                        scan.nextLine();
                        System.out.println("\n");

                        while (escolha.equals("sim") || escolha.equals("s")) {
                            if (c >= livros.length - 1) {
                                System.out.println("Nao foi possivel cadastrar mais usuarios! Espaço insuficiente!");
                                scan.nextLine();
                                break;
                            }

                            System.out.println("Digite seu ID de cliente: ");
                            int idUsu = scan.nextInt();
                            scan.nextLine();

                            // busca pelo cliente 
                            Clientes clienteSelecionado = null;
                            for (int i = 0; i < clientes.length; i++) {
                                if (clientes[i] != null && clientes[i].getId() == idUsu) {
                                    clienteSelecionado = clientes[i];
                                    break;
                                }
                            }
                            // caso cliente não seja encontrado
                            if (clienteSelecionado == null) {
                                System.out.println("Cliente não cadastrado!");
                                break;
                            }
                            // verificação se o cliente tem empréstimo ativo, atribuindo valor true a variavel emprestimoAtivo caso tenha 
                            boolean emprestimoAtivo = false;
                            for (int e = 0; e < emprestimo.length; e++) {
                                if (emprestimo[e] != null && emprestimo[e].getCliente().getId() == clienteSelecionado.getId()) {
                                    emprestimoAtivo = true;
                                    break;
                                }
                            }
                            // caso cliente possua emprestimo ativo, a variavel emprestimoAtivo será true e se encaixara nesse condição
                            if (emprestimoAtivo) {
                                System.out.println("O cliente possui emprestimo ativo!");
                            } // caso não possua, entrara nesta condição
                            else {
                                System.out.println("Digite o código do livro que deseja: ");
                                int codigoLivro = scan.nextInt();
                                scan.nextLine();

                                Livros livroSelecionado = null;
                                for (int li = 0; li < livros.length; li++) {
                                    if (livros[li] != null && livros[li].getMostrarIdLivro() == codigoLivro) {
                                        livroSelecionado = livros[li];
                                        break;
                                    }
                                }
                                if (livroSelecionado == null) {
                                    System.out.println("Livro nao encontrado na base de dados.");
                                } else if (!livroSelecionado.verificarDisponibilidade()) {
                                    System.out.println("Livro indisponivel para emprestimo!");
                                } else {
                                    if (em > emprestimo.length - 1) {
                                        System.out.println("Nao foi possivel realizar mais emprestimos! Espaço insuficiente em nosso sistema!");
                                        scan.nextLine();
                                    }
                                    em++;

                                    for (int i = 0; i < clientes.length; i++) {
                                        if (clientes[i] != null) {
                                            qtdEmprestimos++;
                                        }
                                    }
                                    System.out.println("Digite a data de emprestimo(dd/mm/aaaa): ");
                                    String dataEmprestimo = scan.nextLine();
                                    emprestimo[qtdEmprestimos] = new Emprestimo(livroSelecionado, dataEmprestimo, clienteSelecionado);
                                    livroSelecionado.setPegarlivro(1);
                                    clienteSelecionado.setQuantidadeEmprestimos(1);
                                    System.out.println("Emprestimo realizado com sucesso!");
                                }

                            }

                            System.out.println("Deseja realizar outro empréstimo? (s/n): ");
                            escolha = scan.next().toLowerCase();
                            scan.nextLine();
                        }

                    } catch (Exception e) {
                        System.out.println("Erro na entrada de dados. Verifique e tente novamente.");
                        scan.nextLine(); // Limpa a entrada para evitar looping em caso de erro
                    }
                    
                    System.out.println("\n\n");
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         DEVOLUÇÃO      ");
                    System.out.println("===========================");
                    try {
                        System.out.println("Deseja fazer a devolução de algum livro, digite S ou N");
                        String opc_sec = scan.nextLine();
                        System.out.println("\n");

                        // enquanto o usuario digitar uma das opções abaixo continuará rodando o código
                        while ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            System.out.println("Digite seu id de cliente:");
                            idUsuario = scan.nextInt();

                            // Busca pelo cliente, quando achar atribuirá o valor da respectiva posição para clienteSelecionado, tornando-se então não nula
                            Clientes clienteSelecionado = null;
                            for (int i = 0; i < clientes.length; i++) {
                                if (clientes[i] != null && clientes[i].getId() == idUsuario) {
                                    clienteSelecionado = clientes[i];
                                    break;
                                }
                            }
                            // Se o cliente não foi encontrado, não será atribuido valor então cáira aqui, imprimira a mensagem e não rodará o código
                            if (clienteSelecionado == null) {
                                System.out.println("Cliente não encontrado.");
                            } else {
                                //validar para ver se o cliente realmente possui empréstimos, seguindo a mesma lógica anterior, quando for encontrado a variável emmprestimoAtivo será true
                                boolean emprestimoAtivo = false;
                                int posicaoEmprestimo = -1; // essa variável auxiliar é para armazenar a posição encontrada da array de emprestimo, para assim que a devolução ocorrer deixar a posição da array nula 
                                for (int j = 0; j < emprestimo.length; j++) {
                                    if ((emprestimo[j] != null) && (emprestimo[j].getCliente().getId() == clienteSelecionado.getId())) {
                                        emprestimoAtivo = true;
                                        posicaoEmprestimo = j;
                                        break;
                                    }
                                }
                                //caso usuario não possua empréstimos ativos, não tem o que devolver 
                                if (!emprestimoAtivo) {
                                    System.out.println("O cliente nao possui emprestimos ativos, nao ha nada para devolver!");
                                } else {
                                    // se sastifez todas as condições anteriores para encontrar o livro, então é só alterar os campos.
                                    Livros livroEmprestado = emprestimo[posicaoEmprestimo].getLivro(); //armazena na variavel livroEmprestado, do tipo Livros, o livro emprestado presente na array emprestimo na posição encontrada anteriormente
                                    livroEmprestado.setDevolverLivros(1); //devolve o livro incrementando através deste método, devida variável ser do tipo livros 
                                    clienteSelecionado.setDiminuirQuantidade(1);//diminui a quantiade de emprestimos atribuidos ao cliente, permitindo com que ele posso realizar mais emprestimos
                                    emprestimo[posicaoEmprestimo] = null; // deixa a posição do antigo empréstimo nula, permitindo mais empréstimos

                                    System.out.println("Devolucao concluida!");
                                }
                            }
                            System.out.println("Deseja realizar mais uma devolução? S/N ");
                            opc_sec = scan.nextLine();
                            scan.nextLine();
                        }
                    } catch (Exception e) {
                        System.out.println("!!!! ERRO NA BASE DE DADOS !!!");
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         LISTAGEM LIVROS      ");
                    System.out.println("===========================");
                    System.out.println("Deseja listar todos os livros, digite S ou N");
                    String opc_sec = scan.nextLine();
                    System.out.println("\n");
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {
                            for (int i = 0; i < livros.length; i++) {
                                if (livros[i] != null) {
                                    System.out.println(livros[i].toString());
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Mensagem de erro");
                        }
                    }
                    System.out.println("\n");
                    break;

                case 6:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         CADASTRO USUARIOS      ");
                    System.out.println("===========================");
                    System.out.println("Deseja listar todos os usuários, digite S ou N");
                    opc_sec = scan.nextLine();
                    System.out.println("\n");
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {
                            for (int i = 0; i < clientes.length; i++) {
                                if (clientes[i] != null) {
                                    System.out.println("\n");
                                    System.out.println(clientes[i].toString());
                                    System.out.println("\n");
                                }
                            }

                        } catch (Exception e) {
                            System.out.println("Mensagem de erro");
                        }
                    }
                    System.out.println("\n");
                    break;

                case 7:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         EMPRESTIMOS ATIVOS     ");
                    System.out.println("===========================");
                    System.out.println("Deseja consultar os empréstimos ativos, digite S ou N");
                    opc_sec = scan.nextLine();
                    System.out.println("\n");
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {
                            for (int i = 0; i < emprestimo.length; i++) {
                                if (emprestimo[i] != null) {
                                    System.out.println("\n");
                                    System.out.println(emprestimo[i].toString());
                                    System.out.println("\n");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Mensagem de erro");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 8: 
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("         EXPORTAR DADOS     ");
                    System.out.println("===========================");
                    try{
                        System.out.println("Deseja exportar os dados?, digite S ou N");
                        opc_sec = scan.nextLine();
                        System.out.println("\n");
                        
                        if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)){
                            FileWriter arquivo = new FileWriter("./arquivos/arquivo.txt", true);
                            PrintWriter gravaArquivo = new PrintWriter(arquivo);

                            for(int i = 0; i < livros.length; i++){
                                gravaArquivo.println(livros[i]);
                            }
                            for(int j = 0; j < livros.length; j++){
                                gravaArquivo.println(clientes[j]);
                            }
                            for(int k = 0; k < livros.length; k++){
                                gravaArquivo.println(emprestimo[k]);
                            }
                            gravaArquivo.close();
                            arquivo.close();
                        }
                    }catch(Exception e){
                        System.out.println("Erro ao exportar os dados!");
                    }
                    break;
                case 9:
                    System.out.println("\n");
                    System.out.println("Obrigado por usar nosso programa!");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Selecione a opção correta!");
                    System.out.println("\n");
                    break;
            }
        } while (opc_pri != 9);

    }
}
