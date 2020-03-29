/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJLINK
 */
public class ContaBancaria {

    private int conta;
    private String nome;
    private double saldo;
    

    
    public ContaBancaria(int cont, String nome) {
        this.conta = cont;
        this.nome = nome;
    }

    
    public ContaBancaria(int cont, String nome, double saldo) {
        this.conta = cont;
        this.nome = nome;
        this.saldo = saldo;
    }

    
    public void saque(double valor){
     this.setSaldo(this.getSaldo()-valor-5);
    }
    public void deposito(double valor){
     this.setSaldo(this.getSaldo()+valor);
    }
    
    public int getCont() {
        return conta;
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
    public String toString(){
    return "Conta:"+this.getCont()+
           "    Nome:"+this.getNome()+
           "    Saldo:"+this.getSaldo();
          
    
}
}
