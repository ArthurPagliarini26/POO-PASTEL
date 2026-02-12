package view;

import java.util.*;
import model.Pastel;

public class Atendente {

    Scanner leitor;

    public Atendente() {
        leitor = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("===MENU PRINCIPAL===");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cliente");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
        return leitor.nextInt();

    }

    public int menuFuncionario() {
        System.out.println("===MENU FUNCIONÁRIO===");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Remover Produto");
        System.out.println("0 - Ir para a aba anterior");
        System.out.print("Digite aqui: ");
        return leitor.nextInt();
    }

    public int menuCliente() {
        System.out.println("===MENU CLIENTE===");
        System.out.println("1 - Ver cardápio");
        System.out.println("2 - Comprar pastel");
        System.out.println("0 - Ir para a aba anterior");
        System.out.print("Digite aqui: ");
        return leitor.nextInt();
    }

    public String saborPastel() {
        System.out.print("Digite o sabor do pastel: ");
        leitor.nextLine();
        return leitor.nextLine();
        
    }

    public double precoPastel() {
        System.out.print("Digite o preço do pastel: ");
        return leitor.nextDouble();
    }

    public int estoquePastel() {
        System.out.print("Digite o estoque desse pastel: ");
        return leitor.nextInt();
    }

    public String removerPastel() {
        System.out.print("Digite o nome do pastel para remover: ");
        leitor.nextLine();
        return leitor.nextLine();
    }

    public String comprarpastel() {
        System.out.print("Qual sabor de pastel você vai comprar: ");
        leitor.nextLine();
        return leitor.nextLine();
    }

    public void visualizarCardapio(Pastel pastel) {
        System.out.println(pastel);

    }

}