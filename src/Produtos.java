/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJLINK
 */
public class Produtos {

  
 private String nome;
 private double valor;
 private int quantidade;
 
 
 
 
public Produtos(){
} 

 
public Produtos(String n,double v,int qt){
 this.nome=n;
 this.valor=v;
 this.quantidade=qt;
}

public double totalValorEstoque(){
 double total= this.getValor()*this.getQuantidade();
 return total;
}

public void addProdutos(int uni){
    this.setQuantidade(this.getQuantidade() + uni);
}

public void removerProdutos(int uni){
    this.setQuantidade(this.getQuantidade() - uni);    
}


public String toString(){
    return this.getNome()+
            "          $  "+String.format("%.2f", getValor())+
            "      quantidade"+this.getQuantidade()+" Total em estoque: "+
            "Valor em estoque:"+String.format("%.2f",this.totalValorEstoque());
}

  /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
