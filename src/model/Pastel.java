package model;

public class Pastel {

    private double preco;
    private int estoque;
    private String sabor;

    public Pastel() {

        this.preco = 0.0;
        this.estoque = 0;
        this.sabor = "";
    }

    public Pastel(String sabor, double preco, int estoque) {

        this.sabor = sabor;
        this.preco = preco;
        this.estoque = estoque;
        
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override

    public String toString() {
        return "Sabor: " + sabor + "\nPreço: " + preco + "\nEstoque: " + estoque;
    }
}
