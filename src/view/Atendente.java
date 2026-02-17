package view;

import java.util.*;
import model.*;

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
        System.out.println("1 - Cadastrar Pastel");
        System.out.println("2 - Cadastrar Suco");
        System.out.println("3 - Remover Produto");
        System.out.println("0 - Ir para a aba anterior");
        System.out.print("Digite aqui: ");
        return leitor.nextInt();
    }


    public int menuCliente() {
        System.out.println("===MENU CLIENTE===");
        System.out.println("1 - Ver cardápio");
        System.out.println("2 - Comprar pastel");
        System.out.println("3 - Comprar suco");
        System.out.println("0 - Ir para a aba anterior");
        System.out.print("Digite aqui: ");
        return leitor.nextInt();
    }

    public String saborPastel() {
        System.out.print("Digite o sabor do pastel: ");
        return leitor.nextLine();
        
    }

    public String saborFruta() {
        System.out.print("Digite o sabor da fruta: ");
        return leitor.nextLine();
        
    }

    public double precoProduto() {
        System.out.print("Digite o preço do produto: ");
        return leitor.nextDouble();
    }

    public int estoqueProduto() {
        System.out.print("Digite o estoque desse produto: ");
        return leitor.nextInt();
    }

    public String removerProduto() {
        System.out.print("Digite o nome do produto para remover: ");
        leitor.nextLine();
        return leitor.nextLine();
    }

    public String comprarpastel() {
        System.out.print("Qual sabor de pastel você vai comprar: ");
        leitor.nextLine();
        return leitor.nextLine();
    }

    public void visualizarCardapioPasteis(Produto pastel) {
        System.out.println(pastel);

    }

    public void visualizarCardapioSucos(Suco suco) {
        System.out.println(suco);

    }

    public String nomeProduto() {
        System.out.print("Qual o nome do produto: ");
        leitor.nextLine();
        return leitor.nextLine();
    }



    public int numeroPasteis() {
        System.out.print("Quantos pastéis você quer comprar: ");
        return leitor.nextInt();
    }

}