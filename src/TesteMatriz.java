
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
public class TesteMatriz {
    
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
   
    int n= 3;
    int m =3;
    int[][]mat=new int[n][m];  
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.println("Digite o numero para guardar na matriz");
           mat[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        System.out.printf("%n");
        for(int j=0;j<m;j++){
            System.out.printf(mat[i][j]+"-");      
    }    
    } 
    
    
    System.out.printf("%n Digte um numero que deseja encontrar na matriz:");
    int enc=sc.nextInt();
    
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){ 
            if (enc== mat[i][j]){
                System.out.println("Linha:"+(i+1)+"   Coluna:"+(j+1));
                if(j>0){
                System.out.println("à esqueda:"+mat[i][j-1]);
                }
                if(j<m-1){
                System.out.println("à direta:"+mat[i][j+1]);
                }
                if(i>0){
                System.out.println("Acima:"+mat[i-1][j]);
                }
                if(i<n-1){
                System.out.println("Abaixo:"+mat[i+1][j]); 
                }
               
            }
        }
            
        }
    
        
        
        
    sc.close();
    }
    
}
