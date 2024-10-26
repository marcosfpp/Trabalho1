package Trabalho1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
private String livro;
private boolean emprestado;
private LocalDate dataEmprestimo;
private LocalDate dataDevolucao;
private Cliente cliente; // Associando o cliente ao empréstimo

public Emprestimo(String livro, Cliente cliente) {
 this.livro = livro;
 this.emprestado = false;
 this.cliente = cliente;

}
 // Método para emprestar sem data específica (assume a data de hoje)
public void emprestar() {
   if (!emprestado) { 
      emprestado = true;
      dataEmprestimo = LocalDate.now();
       System.out.println("Livro " + livro + " emprestado a  " + cliente.getNome() + " em " + dataEmprestimo + ".");
   } else {
       System.out.println("Livro " + livro + " já está emprestado."); 
   }
}
// Sobrecarga do método emprestar para especificar uma data de empréstimo.
public void emprestar(LocalDate data) {
if (!emprestado) {
    emprestado = true;
    dataEmprestimo = data;
    System.out.println("Livro " + livro + " emprestado a  " + cliente.getNome() + "em " + dataEmprestimo + ".");
} else {
    System.out.println("Livro " + livro + " já está emprestado.");
       }
}
public void devolver() {
   if (emprestado) { 
       emprestado = false;
       dataDevolucao = LocalDate.now();
       System.out.println("Livro " + livro + " devolvido em " + dataDevolucao + " pelo cliente " + cliente.getNome() + ".");
   } else {
       System.out.println("Livro " + livro + " não estava emprestado.");
   }
}
 
// Método para verificar se o livro está emprestado
public boolean isEmprestado() {
    return emprestado;
    }
//Método para obter o título do livro
public String getlivro() {
    return livro;
    }
//Método para obter a data de empréstimo
public LocalDate getDataEmprestimo() {
return dataEmprestimo;
}
//Método para obter a data de devolução 
public LocalDate getDataDevolucao() {
    return dataDevolucao;
}

class Cliente {
    private String nome;
    private List<Emprestimo> emprestimos;

    public Cliente(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    // Método para adicionar um novo empréstimo, se o cliente não possui outro ativo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (!temEmprestimoAtivo()) {
            emprestimos.add(emprestimo);
            emprestimo.emprestar();
        } else {
            System.out.println("Cliente '" + nome + "' já possui um empréstimo ativo.");
        }
    }

    // Método para verificar se há algum empréstimo ativo
    public boolean temEmprestimoAtivo() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.isEmprestado()) {
                return true;
            }
        }
        return false;
    }

    // Método para devolver um livro específico
    public void devolverLivro(String tituloLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getlivro().equalsIgnoreCase(tituloLivro) && emprestimo.isEmprestado()) {
                emprestimo.devolver();
                return;
            }
        }
        System.out.println("Livro '" + tituloLivro + "' não encontrado ou já devolvido.");
    }

    public String getNome() {
        return nome;
    }
    
        }

}
