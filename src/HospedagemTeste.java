
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJLINK
 */
public class HospedagemTeste {
    
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);  
    
    AlunosHospedes[]quartos= new AlunosHospedes[10];
    
    System.out.println("Digite o numero de estudantes que vão alugar quartos(maximo 10):");
    int n;
    
    do{
       n= sc.nextInt();
       if(n>10)
        System.out.println("DValor máximo 10. Tente novamente");
    } while(n>10);
    
    for(int i=0;i<n;i++){
     System.out.println("Digite o quarto(o ao 9)");
     int m;
     
     do{
     m= sc.nextInt();
     if(quartos[m]!= null || m> quartos.length)
      System.out.println("Quarto ocupado ou invalido. Tente outro (o ao 9)");
     }while(quartos[m]!=null);
       
        quartos[m]= new AlunosHospedes(); 
        System.out.println("Digite o nome");
        quartos[m].setNome(sc.next());
        System.out.println("Digite o Email");
        quartos[m].setEmail(sc.next());
        quartos[m].setQuarto(m);
        System.out.println("Estudante cadastrado com sucesso:");
       }
      
      System.out.println("Relatório:");
      for(AlunosHospedes q: quartos){
          if(q!=null)
          System.out.println(q.getQuarto()+":"+q.getNome()+"       "+q.getEmail());
          
        }
    
    
    
    
    }
    
}
