package service;

import view.Atendente;
import model.Pastel;
import java.util.*;

public class Estoque {

    List<Pastel> listaPasteis;

    public Estoque() {
        listaPasteis = new ArrayList<>();
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

                    String sabor = atendente.saborPastel();
                    double preco = atendente.precoPastel();
                    int estoque = atendente.estoquePastel();

                    Pastel pastel = new Pastel(sabor, preco, estoque);
                    listaPasteis.add(pastel);

                } else if(opcaoMenuFuncionario == 2) {

                    String nome = atendente.removerPastel();
                    boolean removido = false;

                    for(Pastel pastel : listaPasteis) {
                        if(pastel.getSabor().equalsIgnoreCase(nome)) {
                            listaPasteis.remove(pastel);
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

                    if(listaPasteis.isEmpty()) {

                        System.out.println("===Estamos sem pastéis no momento===");

                    } else {

                        for(Pastel pastel : listaPasteis) {
                            System.out.println("===" + pastel.getSabor() +"===");
                            atendente.visualizarCardapio(pastel);
                        }
                    }
                } else if(opcaoMenuCliente == 2) {

                    String nome = atendente.comprarpastel();
                    boolean comprado = false;

                    for(Pastel pastel : listaPasteis) {
                        if(pastel.getSabor().equalsIgnoreCase(nome)) {
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