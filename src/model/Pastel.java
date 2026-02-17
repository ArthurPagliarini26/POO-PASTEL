package model;

public class Pastel extends Produto{

    private String sabor;

    public Pastel(String sabor, double preco, int estoque, String nome) {

        super(nome, preco, estoque);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override

    public String infoProduto() {
        return "Sabor: " + sabor + "\nPreço: " + getPreco() + "\nEstoque: " + getEstoque();
    }

    
}
