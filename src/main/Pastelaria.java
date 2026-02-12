package main;

import view.Atendente;
import service.Estoque;

public class Pastelaria {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Atendente atendente = new Atendente();
        int opcao;

        do {
            opcao = atendente.menuPrincipal();
            estoque.gerenciarEstoque(opcao, atendente);


        } while(opcao != 0);
    }



}