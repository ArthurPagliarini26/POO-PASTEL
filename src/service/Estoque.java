package service;

import view.Atendente;
import model.*;
import java.util.*;

public class Estoque {

    List<Produto> listaProdutos;

    public Estoque() {
        listaProdutos = new ArrayList<>();
    } 

    public void gerenciarEstoque(int opcao, Atendente atendente) {

        switch (opcao) {

           
            case 1: {

                int opcaoMenuFuncionario;

                do {
                opcaoMenuFuncionario = atendente.menuFuncionario();

                if(opcaoMenuFuncionario == 0) {
                    System.out.println("Voltando para o menu anterior...");
                    return;

                }
                if(opcaoMenuFuncionario == 1) {

                    String nome = atendente.nomeProduto();
                    String sabor = atendente.saborPastel();
                    double preco = atendente.precoProduto();
                    int estoque = atendente.estoqueProduto();

                    Produto pastel = new Pastel(sabor, preco, estoque, nome);
                    listaProdutos.add(pastel);

                } else if(opcaoMenuFuncionario == 2) {

                    String nome = atendente.nomeProduto();
                    String saborFruta = atendente.saborFruta();
                    double preco = atendente.precoProduto();
                    int estoque = atendente.estoqueProduto();

                    Produto suco = new Suco(saborFruta, preco, estoque, nome);
                    listaProdutos.add(suco);
                
                } else if(opcaoMenuFuncionario == 3) {

                    String nome = atendente.removerProduto();
                    boolean removido = false;

                    for(Produto produto : listaProdutos) {
                        if(produto.getNome().equalsIgnoreCase(nome)) {
                            listaProdutos.remove(produto);
                            removido = true;
                            break;

                        }
                    }

                    if(removido) {
                        System.out.println("===Pastél Removido com Sucesso===");

                    } else {
                        System.out.println("===Pastél Não Existente===");
                    }
                }
               } while(opcaoMenuFuncionario != 0);
            }
            break;

            case 2: {

                int opcaoMenuCliente;

                do {

                    opcaoMenuCliente = atendente.menuCliente();

                    if(opcaoMenuCliente== 0) {
                        System.out.println("Voltando para o menu anterior...");
                        return;
                }

                if(opcaoMenuCliente == 1) {

                    if (listaProdutos.isEmpty()) {
                        System.out.println("=== Nenhum produto cadastrado ===");
                    } else {
                    
                        System.out.println("===== PASTÉIS =====");
                    
                        boolean temPastel = false;
                    
                        for (Produto p : listaProdutos) {
                            if (p instanceof Pastel) {
                                System.out.println(p.infoProduto());
                                temPastel = true;
                            }
                        }
                    
                        if (!temPastel) {
                            System.out.println("Nenhum pastel disponível.");
                        }
                    
                        System.out.println("\n===== SUCOS =====");
                    
                        boolean temSuco = false;
                    
                        for (Produto p : listaProdutos) {
                            if (p instanceof Suco) {
                                System.out.println(p.infoProduto());
                                temSuco = true;
                            }
                        }
                    
                        if (!temSuco) {
                            System.out.println("Nenhum suco disponível.");
                        }
                    }
                } else if(opcaoMenuCliente == 2) {

                    String nome = atendente.comprarpastel();
                    int numeroPasteis = atendente.numeroPasteis();
                    boolean comprado = false;
                    
                    
                    for(Produto pastel : listaProdutos) {
                        if(pastel.getNome().equalsIgnoreCase(nome)) {
                            comprado = true;
                            break;
                        }
                    }

                    if(comprado) {
                        System.out.println("===Compra Realizada Com Sucesso===");

                    } else {
                        System.out.println("===O Sabor de Pastél Não Está Disponível===");
                    }
                }
                
            } while(opcaoMenuCliente != 0);
            break;
  
           }
        }
    }
}