
package Trabalho1;


public class AppEmprestimo {
    public static void main(String[] args) {
        //Criando instâncias de usuário e livro para o teste
        Clientes usuario = new Clientes("Carlos Silva", 101); //Nome e ID do usuário
        Livros livro = new Livros("O Senhor dos Anéis", 1001); // Título e código do livro 
        
        //Exibindo o estado inicial dos objetos
        System.out.println("Usuário criado: " + usuario.getNome() + ", ID: " + usuario.getId());
        System.out.println("Livro criado: " + livro.getTitulo() + ", Código: " + livro.getCodigo());
        
        //criando um empréstimo ativo 
        Emprestimo emprestimo = new Emprestimo(livro, "01/11/2024", usuario);
        System.out.println("\nEmpréstimo criado:\n" + emprestimo);
        
        //verificando a disponibilidade do livro antes do empréstimo
        emprestimo.verificarDisponibilidade();
        
        //Realizando empréstimo
        emprestimo.realizarEmprestimo();
        System.out.println("\nEmpréstimo realizado. Status do empréstimo: " + emprestimo.isEmprestimoAtivo());
        
        //Devolvendo o livro
        emprestimo.devolverLivro();
        System.out.println("\nLivro devolvido. Status do empréstimo: " + emprestimo.isEmprestimoAtivo());
        
        //Exibindo o estado final dos objetos 
        System.out.println("\nEstado final do empréstimo:\n" + emprestimo);
        
}