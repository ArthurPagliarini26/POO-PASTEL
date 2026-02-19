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
                        System.out.println("===Produto Removido com Sucesso===");

                    } else {
                        System.out.println("===Pastel Não Existente===");
                    }
                } else if(opcaoMenuFuncionario == 4) {

                    String nome = atendente.atualizarProduto();
                    boolean encontrado = false;
                    
                    for (Produto produto : listaProdutos) {
                    
                        if (produto.getNome().equalsIgnoreCase(nome)) {
                    
                            encontrado = true;
                    
                            String novoNome = atendente.NoveNomeProduto();
                            double novoPreco = atendente.NovoPrecoProduto();
                            int novoEstoque = atendente.NovoEstoqueProduto();
                    
                            produto.setNome(novoNome);
                            produto.setPreco(novoPreco);
                            produto.setEstoque(novoEstoque);
                    
                            if (produto instanceof Pastel) {
                                String novoSabor = atendente.NovoSaborPastel();
                                ((Pastel) produto).setSabor(novoSabor);
                    
                            } else if (produto instanceof Suco) {
                                String novoSabor = atendente.NovoSaborFruta();
                                ((Suco) produto).setSaborFruta(novoSabor);
                            }
                    
                            System.out.println("=== Produto Atualizado Com Sucesso ===");
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("=== O Produto Não Foi Encontrado ===");
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

                    String nome = atendente.comprarPastel();
                    int quantidade = atendente.numeroPasteis();
                
                    boolean encontrado = false;
                
                    for (Produto p : listaProdutos) {
                
                        if (p instanceof Pastel) {
                
                            Pastel pastel = (Pastel) p;
                
                            if (pastel.getNome().equalsIgnoreCase(nome)) {
                
                                encontrado = true;
                
                                if (pastel.getEstoque() >= quantidade) {
                
                                    pastel.setEstoque(pastel.getEstoque() - quantidade);
                
                                    System.out.println("=== Compra realizada com sucesso ===");
                
                                } else {
                
                                    System.out.println("=== Estoque insuficiente ===");
                                }
                
                                break;
                            }
                        }
                    }
                
                    if (!encontrado) {
                        System.out.println("=== Pastel não encontrado ===");
                    }
                    
                } else if(opcaoMenuCliente == 3) {
                    String nome = atendente.comprarSuco();
                    int quantidade = atendente.numeroSucos();
                
                    boolean encontrado = false;
                
                    for (Produto p : listaProdutos) {
                
                        if (p instanceof Suco) {
                
                            Suco suco = (Suco) p;
                
                            if (suco.getNome().equalsIgnoreCase(nome)) {
                
                                encontrado = true;
                
                                if (suco.getEstoque() >= quantidade) {
                
                                    suco.setEstoque(suco.getEstoque() - quantidade);
                
                                    System.out.println("=== Compra realizada com sucesso ===");
                
                                } else {
                
                                    System.out.println("=== Estoque insuficiente ===");
                                }
                
                                break;
                            }
                        }
                    }
                
                    if (!encontrado) {
                        System.out.println("=== Suco não encontrado ===");
                    }
                }
                
            } while(opcaoMenuCliente != 0);
            break;
  
           }
        }
    }
}