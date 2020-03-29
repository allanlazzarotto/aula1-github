/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJLINK
 */
public class AlunosHospedes {
private String nome;
private String email; 
private int quarto;

    public AlunosHospedes() {
    }

   

    public AlunosHospedes(String nome, String email,int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto=quarto;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int getQuarto() {
        return quarto;
    }
}
