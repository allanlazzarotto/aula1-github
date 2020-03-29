
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
public class TesteFuncionario {
   
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
    List<Funcionario> list= new ArrayList<>();

    System.out.println("Digite o numero de funcionários");
    int n= sc.nextInt();
    
    for (int i=0;i<n;i++){
        System.out.println("Digite o ID, nome e salario:");
        Funcionario f= new Funcionario(sc.nextInt(),sc.next(),sc.nextDouble());
        list.add(f);
        System.out.println("Funcionario adicionado com sucesso");
    }

    for(Funcionario f: list){
    System.out.println(f.getId()+"."+f.getNome()+"......."+f.getSalario());
       
    }
    

    
    System.out.println("Digite o ID do funcionário que irá ganhar um aumento:");
    Integer id= sc.nextInt();
    Funcionario fa= list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
    if(fa==null){
        System.out.println("ID não existente.");
    }
    else{
      System.out.println("Digite a porcentagem de aumento:");
     double pc=sc.nextDouble();
     
     
        
    }
   
   
       
   

    sc.close();   
}
}
