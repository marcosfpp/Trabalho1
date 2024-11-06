package Trabalho1;

import java.util.Scanner;

public class AppLivros {
    public static void main(String[] args){
        Livros[] livros = new Livros[2];
        Scanner scan = new Scanner(System.in);
        int opcaoMenu = 0 ;
        int j = -1;
        
        while (opcaoMenu != 3){
                System.out.println("Biblioteca dos DEV's");
                System.out.println("1 - Cadastro de livros \n2 - Mostrar livros \n3 - Sair ");
                System.out.println("Digite o opção desejada: ");
                opcaoMenu = scan.nextInt();
                scan.nextLine();
                
                switch(opcaoMenu){
                    case 1:
                        for (int i = 0; i < 50; i++){
                            System.out.println("\n");
                        }
                        if (livros.length <= 2){
                            String c = new String(); 
                            c = "s";
                            while(c == "s" || c == "S"){
                                j++;
                                System.out.println("Digite o título do livro: ");
                                String nome = scan.nextLine();
                                System.out.println("\n");

                                System.out.println("Digite o(s) autor(es) do livro: ");
                                String autor = scan.nextLine();
                                System.out.println("\n");

                                System.out.println("Digite o ano de publicação: ");
                                int anoPubli = scan.nextInt();
                                scan.nextLine();
                                System.out.println("\n");

                                System.out.println("Digite a quantidade de exemplares disponíveis: ");
                                int quantExemplares = scan.nextInt();
                                scan.nextLine();
                                System.out.println("\n");

                                Livros informacoesLivro = new Livros(nome, autor, anoPubli, quantExemplares);
                                livros[j] = informacoesLivro;
                                
                                System.out.println(livros.length);
                                
                                System.out.println("Deseja continuar? S/N");
                                c = scan.nextLine();
                                
                                System.out.println(livros.length);

                                System.out.println("\n\n");
                            }
                            for (int i = 0; i < 50; i++){
                                System.out.println("\n");
                            }
                        }
                        else{
                            System.out.println("Não e possível cadastrar mais livros!");
                        }
                        break;
                    
                    case 2:
                        for(Livros i : livros){
                            System.out.println(i);
                        }  
                        break;
                        
                    case 3:
                        System.out.println("Obrigado por usar nosso sistema!");
                       break;
                       
                    default: 
                        System.out.println("Digite uma opção válida! ");
                        break; 
                }
        for (int i = 0; i < 50; i++){
            System.out.println("\n");
        }
        } 
    }
            
}
