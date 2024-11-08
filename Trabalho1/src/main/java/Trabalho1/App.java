package Trabalho1;

import java.util.Scanner;

public class App {

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
        int opc_pri;
        int l = -1;
        int c = -1;

        //Inserir os verificadores aqui
        //Lógica de devolução
        boolean v_codigousuario = false;
        boolean v_codigolivro = false;
        boolean v_usu_livro = false;
        //

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
            System.out.println("8- SAIR");

            System.out.println("Digite a opção que deseja prosseguir:");
            opc_pri = scan.nextInt();
            scan.nextLine();

            switch (opc_pri) {
                case 1:
                    System.out.println("\n");
                    try {
                        System.out.println("Deseja cadastrar um livro, digite S ou N");
                        String opc_sec = scan.nextLine();
                        
                        while ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)){
                            // verifica se a arrray esta cheia para cadastro de livros
                            if (l >= livros.length - 1){
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
                    }catch (Exception e){
                        System.out.println("Erro ao cadastrar livro!");
                        scan.nextLine();
                    }
                    
                    System.out.println("\n\n");
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("\n");
                    try {
                        System.out.println("Deseja cadastrar um usuário, digite S ou N");
                        String opc_sec = scan.nextLine();
                        while ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                            // valida se tem espaço na array 
                            if (c >= livros.length - 1 ){
                                System.out.println("Nao foi possivel cadastrar mais usuarios! Espaço insuficiente!");
                                scan.nextLine();
                                break;
                            }
                            l++;
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
                            contatoUsuario = scan.nextLine();
                                    
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
                    try {
                        System.out.println("===========================");
                        System.out.println("          EMPRÉSTIMO      ");
                        System.out.println("===========================");

                        System.out.println("Deseja pegar um livro emprestado? (s/n): ");
                        String escolha = scan.next().trim().toLowerCase();
                        scan.nextLine();
                        
                        int qtdEmprestimos = 0;

                        while (escolha.equals("sim") || escolha.equals("s")) {
                            System.out.println("Digite seu ID de cliente: ");
                            int idUsu = scan.nextInt();
                            scan.nextLine();

                            // busca pelo cliente 
                            Clientes clienteSelecionado = null;
                            for (int i =  0; i < clientes.length; i++) {
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
                            for (int e = 0; e < emprestimo.length; e++){
                                if (emprestimo[e] != null && emprestimo[e].getCliente().getId() == clienteSelecionado.getId()){
                                    emprestimoAtivo = true;
                                    break;
                                }     
                            }
                            // caso cliente possua emprestimo ativo, a variavel emprestimoAtivo será true e se encaixara nesse condição
                            if (emprestimoAtivo){
                                System.out.println("O cliente possui emprestimo ativo!");
                            }
                            // caso não possua, entrara nesta dondição
                            else {
                                System.out.println("Digite o código do livro que deseja: ");
                                int codigoLivro = scan.nextInt();
                                scan.nextLine();
                                
                                Livros livroSelecionado = null;
                                for (int li = 0; li < livros.length; li++){
                                    if(livros[li]!= null && livros[li].getMostrarIdLivro() == codigoLivro){
                                        livroSelecionado = livros[li];
                                        break;
                                    }
                                }
                                if (livroSelecionado == null){
                                    System.out.println("Livro nao encontrado na base de dados.");
                                }
                                else if (!livroSelecionado.verificarDisponibilidade()){
                                    System.out.println("Livro indisponivel para emprestimo!");
                                }
                                else {
                                    System.out.println("Digite a data de emprestimo(dd/mm/aaaa): ");
                                    String dataEmprestimo = scan.nextLine();
                                    emprestimo[qtdEmprestimos++] = new Emprestimo(livroSelecionado, dataEmprestimo, clienteSelecionado);
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
                    System.out.println("Deseja fazer a devolução de algum livro, digite S ou N");
                    String opc_sec = scan.nextLine();
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {

                            System.out.println("Digite seu id de cliente:");
                            idUsuario = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Digite o id do livro que deseja devolver:");
                            cod_livro = scan.nextInt();
                            scan.nextLine();

                            for (int i = 0; i < clientes.length; i++) {
                                if (clientes[i] != null && clientes[i].getId() == idUsuario && livros[i].getMostrarIdLivro() == cod_livro) {
                                    v_codigousuario = true; // Validação
                                    if (clientes[i].getMostrarQuantidadeEmprestada() > 0) {
                                        v_usu_livro = true;
                                        for (int j = 0; j < emprestimo.length; j++) {
                                            if (emprestimo[j] != null) { // Validação
                                                System.out.println("O usuario: " + clientes[j].getNome() + " está com o livro: " + livros[j].getMostrarNome());
                                                System.out.println(clientes[j].getNome() + " deseja devolver o livro acima? S ou N");
                                                opc_sec = scan.nextLine();
                                                if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                                                    for (int k = 0; k < emprestimo.length; k++) {
                                                        if (emprestimo[k] != null) {
                                                            if (emprestimo[k].getCliente().getId() == idUsuario && emprestimo[k].getLivro().getMostrarIdLivro() == cod_livro) {
                                                                emprestimo[k].setDataEmprestimo(null);
                                                                emprestimo[k].verificarDisponibilidade();
                                                                emprestimo[k].finalizarEmprestimo();
                                                                emprestimo[k].getLivro();//Criar um get para aumentar a quantidade de livro / para o livro ficar disponível;
                                                                //emprestimo[k].  fazer um set para retornar o emprestimo ativo para desativado 1 to 0;
                                                                System.out.println(clientes[j].getNome() + " obrigado por devolver o livro " + livros[k].getMostrarNome());
                                                                //Aqui vou dar outro sout mostrando a data de dev e data de emp!!!;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Este cliente não possui livros emprestados.");
                                    }
                                }
                            }

                            // Se o cliente não foi encontrado
                            if (!v_codigousuario) {
                                System.out.println("Cliente não encontrado.");
                            }

                            // Se o cliente não está com o livro específico
                            if (!v_usu_livro) {
                                System.out.println("Este cliente não está com o livro desejado.");
                            }

                        } catch (Exception e) {
                            System.out.println("!!!! ERRO NA BASE DE DADOS !!!");

                        }
                    }
                    break;

                case 5:
                    System.out.println("\n");
                    System.out.println("Deseja listar todos os livros, digite S ou N");
                    opc_sec = scan.nextLine();
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {
                            for (int i = 0; i < livros.length; i++) {
                                if (livros[i] != null) {
                                    livroExistente = true;
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
                    System.out.println("Deseja listar todos os usuários, digite S ou N");
                    opc_sec = scan.nextLine();
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {
                            for (int i = 0; i < clientes.length; i++) {
                                if (clientes[i] != null) {
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
                    System.out.println("Deseja consultar os empréstimos ativos, digite S ou N");
                    opc_sec = scan.nextLine();
                    if ("S".equals(opc_sec) || "s".equals(opc_sec) || "Sim".equals(opc_sec) || "sim".equals(opc_sec)) {
                        try {
                            for (int i = 0; i < emprestimo.length; i++){
                                if(emprestimo[i] != null){
                                    System.out.println(emprestimo[i].toString());
                                    System.out.println("\n");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Mensagem de erro");
                        }
                    }
                    break;
                case 8:
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
        } while (opc_pri != 8);

    }
}
